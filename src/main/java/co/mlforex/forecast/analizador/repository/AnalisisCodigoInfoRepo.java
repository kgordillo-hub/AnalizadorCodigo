package co.mlforex.forecast.analizador.repository;

import co.mlforex.forecast.analizador.model.TransaccionInfo;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface AnalisisCodigoInfoRepo extends CrudRepository<TransaccionInfo, String> {

}
