package co.mlforex.forecast.analizador.logic.factory;

import co.mlforex.forecast.analizador.logic.adapter.Analizador;
import co.mlforex.forecast.analizador.logic.adapter.AnalizadorSonarAdapter;
import co.mlforex.forecast.analizador.logic.adapter.AnalizadorPMDAdapter;

public class AnalizadorFactory {


    public enum TIPOS_ANALIZADOR{
        PMD, SONAR
    }

    public Analizador getAnalizador(String tipo){
        if(tipo.equals(AnalizadorFactory.TIPOS_ANALIZADOR.PMD)){
            return new AnalizadorPMDAdapter();
        }else{
            return new AnalizadorSonarAdapter();
        }
    }
}
