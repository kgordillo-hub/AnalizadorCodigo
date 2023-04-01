package co.mlforex.forecast.analizador.service;

import co.mlforex.forecast.analizador.logic.factory.AnalizadorFactory;
import co.mlforex.forecast.analizador.model.TransaccionInfo;
import co.mlforex.forecast.analizador.notification.NotificadorSns;
import co.mlforex.forecast.analizador.repository.AnalisisCodigoInfoRepo;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServicioAnalisisImpl implements ServicioAnalisis {
    private AnalizadorFactory analizadorFactory = new AnalizadorFactory();

    @Autowired
    AnalisisCodigoInfoRepo analisisCodigoInfoRepo;
    @Value("${aws.sns.topic.analisisOut.arn}")
    String snsTopicAnalisisOut;

    @Override
    public Boolean ejecutarAnalisis(TransaccionInfo transaccionInfo) {
        final Optional<TransaccionInfo> tiDb = analisisCodigoInfoRepo.findById(transaccionInfo.generateUID());
        if(!tiDb.isEmpty()){
            return Boolean.FALSE;
        }else {
            transaccionInfo.getMensaje().setCodigoVulnerable(Boolean.FALSE);
            final String message = new GsonBuilder().disableHtmlEscaping().create().toJson(transaccionInfo);
            new NotificadorSns().publishMessageSns(message,snsTopicAnalisisOut);
            //Ejecutar analisis de código
            transaccionInfo.setUID(transaccionInfo.generateUID());
            analisisCodigoInfoRepo.save(transaccionInfo);
            return Boolean.TRUE;
        }
    }

}
