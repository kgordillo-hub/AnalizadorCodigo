package co.mlforex.forecast.analizador.controller;


import co.mlforex.forecast.analizador.model.TransaccionInfo;
import co.mlforex.forecast.analizador.service.ServicioAnalisis;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class AnalizadorController {

    Logger logger = LoggerFactory.getLogger(AnalizadorController.class);

    @Autowired
    ServicioAnalisis servicioAnalisis;

    @PostMapping("/analizar")
    public ResponseEntity<String> analizarCodigo(@RequestBody TransaccionInfo transaccionInfo) {
        try {
            servicioAnalisis.ejecutarAnalisis(transaccionInfo);
            return new ResponseEntity<>("Done", HttpStatus.OK);
        } catch (final Exception e) {
            logger.error("Error en AnalizadorController:analizarCodigo" + e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
