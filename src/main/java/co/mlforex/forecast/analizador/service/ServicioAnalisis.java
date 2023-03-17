package co.mlforex.forecast.analizador.service;

import co.mlforex.forecast.analizador.model.TransaccionInfo;

public interface ServicioAnalisis {

    Boolean ejecutarAnalisis(TransaccionInfo transaccionInfo);
}
