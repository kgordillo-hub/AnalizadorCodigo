package co.mlforex.forecast.repository;

import co.mlforex.forecast.model.TransaccionInfo;

import java.util.Optional;

public interface AnalisisCodigoInfoRepo {

    Optional<TransaccionInfo> findById(String id);
    void guardarAnalisis(TransaccionInfo transaccionInfo);
}
