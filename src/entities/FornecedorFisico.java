package entities;

import java.util.UUID;

public class FornecedorFisico extends Fornecedor {

    private String nome;

    public FornecedorFisico() {}

    public FornecedorFisico(String documento, Endereco endereco, String nome) {
        super('F', documento, endereco);
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "FornecedorFisico{" +
                "id=" + id +
                ", natureza=" + natureza +
                ", documento='" + documento + '\'' +
                ", nome='" + nome + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
