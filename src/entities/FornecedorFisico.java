package entities;

import java.util.UUID;

public class FornecedorFisico extends Fornecedor {

    private String nome;

    public FornecedorFisico() {}

    public FornecedorFisico(UUID id, String documento, Endereco endereco, String nome) {
        super(id, 'F', documento, endereco);
        this.nome = nome;
    }
}
