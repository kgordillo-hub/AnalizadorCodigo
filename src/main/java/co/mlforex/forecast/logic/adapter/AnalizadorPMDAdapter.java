package co.mlforex.forecast.logic.adapter;

import co.mlforex.forecast.model.Mensaje;

public class AnalizadorPMDAdapter implements Analizador{
    @Override
    public Mensaje analizarVulnerabilidades(Mensaje msg) {
        return new Mensaje();
    }
}
