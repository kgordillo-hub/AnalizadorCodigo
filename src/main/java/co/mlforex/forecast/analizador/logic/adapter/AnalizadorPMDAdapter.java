package co.mlforex.forecast.analizador.logic.adapter;

import co.mlforex.forecast.analizador.model.Mensaje;

public class AnalizadorPMDAdapter implements Analizador{
    @Override
    public Mensaje analizarVulnerabilidades(Mensaje msg) {
        return new Mensaje();
    }
}
