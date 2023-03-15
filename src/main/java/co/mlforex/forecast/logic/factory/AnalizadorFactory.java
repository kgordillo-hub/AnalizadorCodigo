package co.mlforex.forecast.logic.factory;

import co.mlforex.forecast.logic.adapter.Analizador;
import co.mlforex.forecast.logic.adapter.AnalizadorPMDAdapter;
import co.mlforex.forecast.logic.adapter.AnalizadorSonarAdapter;

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
