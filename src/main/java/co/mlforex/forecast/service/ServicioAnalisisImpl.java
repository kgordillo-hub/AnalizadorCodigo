package co.mlforex.forecast.service;

import co.mlforex.forecast.model.Mensaje;
import co.mlforex.forecast.logic.adapter.Analizador;
import co.mlforex.forecast.logic.factory.AnalizadorFactory;

public class ServicioAnalisisImpl implements ServicioAnalisis{
    private AnalizadorFactory analizadorFactory = new AnalizadorFactory();

    @Override
    public Mensaje ejecutarAnalisis(Mensaje msg) {
        Analizador analizador = analizadorFactory.getAnalizador(msg.getAnalizador());
        return analizador.analizarVulnerabilidades(msg);
    }
}
