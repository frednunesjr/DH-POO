package entities;

import java.util.UUID;

public class FornecedorJuridico extends Fornecedor {

    private String razaoSocial;
    private String nomeFantasia;
    private String inscricaoEstadual;
    private String inscricaoMunicipal;

    public FornecedorJuridico() {}

    public FornecedorJuridico(UUID id, String documento, Endereco endereco, String razaoSocial, String nomeFantasia, String inscricaoEstadual, String inscricaoMunicipal) {
        super(id, 'J', documento, endereco);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.inscricaoEstadual = inscricaoEstadual;
        this.inscricaoMunicipal = inscricaoMunicipal;
    }
}
