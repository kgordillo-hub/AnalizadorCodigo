package co.mlforex.forecast.analizador.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTyped;

import java.io.Serializable;
import java.util.List;

@DynamoDBDocument
public class Mensaje implements Serializable {

    @DynamoDBTyped(DynamoDBMapperFieldModel.DynamoDBAttributeType.BOOL)
    @DynamoDBAttribute
    private Boolean codigoVulnerable;
    @DynamoDBAttribute
    private String linkRepo;
    @DynamoDBAttribute
    private String branchRepoName;
    @DynamoDBAttribute
    private String analizadorUsar;
    @DynamoDBAttribute
    private String lastCommitHash;
    @DynamoDBAttribute
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

    @DynamoDBAttribute(attributeName = "listaVulnerabilidades")
    public List<Vulnerabilidad> getListaVulnerabilidades() {
        return listaVulnerabilidades;
    }

    public void setListaVulnerabilidades(List<Vulnerabilidad> listaVulnerabilidades) {
        this.listaVulnerabilidades = listaVulnerabilidades;
    }
}
