package co.mlforex.forecast.analizador.logic.adapter;

import co.mlforex.forecast.analizador.model.Mensaje;

public class AnalizadorSonarAdapter implements Analizador{
    @Override
    public Mensaje analizarVulnerabilidades(Mensaje msg) {
        return new Mensaje();
    }
}
