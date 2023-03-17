package co.mlforex.forecast.analizador.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class Vulnerabilidad {

    @DynamoDBAttribute
    private String tipoVulnerabilidad;
    @DynamoDBAttribute
    private String descripcion;
    @DynamoDBAttribute
    private String severidad;

    public String getTipoVulnerabilidad() {
        return tipoVulnerabilidad;
    }

    public void setTipoVulnerabilidad(String tipoVulnerabilidad) {
        this.tipoVulnerabilidad = tipoVulnerabilidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSeveridad() {
        return severidad;
    }

    public void setSeveridad(String severidad) {
        this.severidad = severidad;
    }
}
