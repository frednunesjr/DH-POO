package entities;

import java.util.UUID;

public abstract class Fornecedor {
    private UUID id;
    private Character natureza;
    private String documento;
    private Endereco endereco;

    public Fornecedor() {}

    public Fornecedor(Character natureza, String documento, Endereco endereco) {
       this.id = UUID.randomUUID();
       this.natureza = natureza;
       this.documento = documento;
       this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "\n\tid=" + id +
                ",\n\tnatureza=" + natureza +
                ",\n\tdocumento='" + documento + '\'' +
                ",\n\tendereco=" + endereco;
    }
}
