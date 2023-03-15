package co.mlforex.forecast.service;

import co.mlforex.forecast.model.Mensaje;

public interface ServicioAnalisis {

    Mensaje ejecutarAnalisis(Mensaje msg);
}
