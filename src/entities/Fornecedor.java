package entities;

import java.util.UUID;

public class Fornecedor {
    private UUID id;
    private Character natureza;
    private String documento;
    private Endereco endereco;

    public Fornecedor() {}

    protected Fornecedor(UUID id, Character natureza, String documento, Endereco endereco) {
       this.id = UUID.randomUUID();
       this.natureza = natureza;
       this.documento = documento;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "id=" + id +
                ", natureza=" + natureza +
                ", documento='" + documento + '\'' +
                ", endereco=" + endereco;
    }
}
