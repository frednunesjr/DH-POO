package entities;

import java.util.UUID;

public abstract class Fornecedor {
    protected UUID id;
    protected Character natureza;
    protected String documento;
    protected Endereco endereco;

    public Fornecedor() {}

    public Fornecedor(Character natureza, String documento, Endereco endereco) {
       this.id = UUID.randomUUID();
       this.natureza = natureza;
       this.documento = documento;
       this.endereco = endereco;
    }

    @Override
    public abstract String toString();
}
