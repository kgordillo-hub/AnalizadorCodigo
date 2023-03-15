package co.mlforex.forecast.logic.adapter;

import co.mlforex.forecast.model.Mensaje;

public class AnalizadorSonarAdapter implements Analizador{
    @Override
    public Mensaje analizarVulnerabilidades(Mensaje msg) {
        return new Mensaje();
    }
}
