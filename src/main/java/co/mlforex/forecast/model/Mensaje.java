package co.mlforex.forecast.model;

import java.io.Serializable;
import java.util.List;

public class Mensaje implements Serializable {


    private Boolean codigoVulnerable;
    private String linkRepo;
    private String branchRepoName;
    private String analizadorUsar;
    private String lastCommitHash;
    private String idUsuario;
    private List<Vulnerabilidad> listaVulnerabilidades;

    public Boolean getCodigoVulnerable() {
        return codigoVulnerable;
    }

    public void setCodigoVulnerable(Boolean codigoVulnerable) {
        this.codigoVulnerable = codigoVulnerable;
    }

    public String getLinkRepo() {
        return linkRepo;
    }

    public void setLinkRepo(String linkRepo) {
        this.linkRepo = linkRepo;
    }

    public String getBranchRepoName() {
        return branchRepoName;
    }

    public void setBranchRepoName(String branchRepoName) {
        this.branchRepoName = branchRepoName;
    }

    public String getAnalizadorUsar() {
        return analizadorUsar;
    }

    public void setAnalizadorUsar(String analizadorUsar) {
        this.analizadorUsar = analizadorUsar;
    }

    public String getLastCommitHash() {
        return lastCommitHash;
    }

    public void setLastCommitHash(String lastCommitHash) {
        this.lastCommitHash = lastCommitHash;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public List<Vulnerabilidad> getListaVulnerabilidades() {
        return listaVulnerabilidades;
    }

    public void setListaVulnerabilidades(List<Vulnerabilidad> listaVulnerabilidades) {
        this.listaVulnerabilidades = listaVulnerabilidades;
    }
}
