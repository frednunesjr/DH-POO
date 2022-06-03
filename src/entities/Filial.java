package entities;

import java.util.UUID;

public class Filial {
    private UUID id;
    private String codigo;
    private boolean status;
    private String cnpj;
    private String nomeFantasia;
    private String inscricaoEstadual;
    private String inscricaoMunicipal;
    private Endereco endereco;

    public Filial() {
    }

    public Filial(String codigo, boolean status, String cnpj, String nomeFantasia, String inscricaoEstadual, String inscricaoMunicipal, Endereco endereco) {
        this.id = UUID.randomUUID();
        this.codigo = codigo;
        this.status = status;
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.inscricaoEstadual = inscricaoEstadual;
        this.inscricaoMunicipal = inscricaoMunicipal;
        this.endereco = endereco;
    }
}
