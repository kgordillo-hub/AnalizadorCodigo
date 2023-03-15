package co.mlforex.forecast.controller;


import co.mlforex.forecast.model.Mensaje;
import co.mlforex.forecast.model.TransaccionInfo;
import co.mlforex.forecast.service.ServicioAnalisis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AnalizadorController {

    @Autowired
    ServicioAnalisis servicioAnalisis;

    @PostMapping("/analizar")
    public Mensaje analizarCodigo(TransaccionInfo transaccionInfo){

        return servicioAnalisis.ejecutarAnalisis(transaccionInfo.getMensaje());
    }
}
