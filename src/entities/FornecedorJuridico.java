package entities;

import java.util.UUID;

public class FornecedorJuridico extends Fornecedor {

    private String razaoSocial;
    private String nomeFantasia;
    private String inscricaoEstadual;
    private String inscricaoMunicipal;

    public FornecedorJuridico() {}

    public FornecedorJuridico(String documento, Endereco endereco, String razaoSocial, String nomeFantasia, String inscricaoEstadual, String inscricaoMunicipal) {
        super('J', documento, endereco);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.inscricaoEstadual = inscricaoEstadual;
        this.inscricaoMunicipal = inscricaoMunicipal;
    }
}
