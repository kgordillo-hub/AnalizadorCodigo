package co.mlforex.forecast.model;

public class Vulnerabilidad {

    private String tipoVulnerabilidad;
    private String descripcion;
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
