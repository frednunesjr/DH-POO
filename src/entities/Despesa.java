package entities;

import java.time.LocalDate;
import java.util.UUID;

public class Despesa {

    private UUID id;
    private LocalDate criadaEm;
    private Fornecedor fornecedor;
    private String descricao;
    private Filial centroCusto;
    private Filial destino;
    private double valor;
    private double valorPago;

    public Despesa() {
    }

    public Despesa(Fornecedor fornecedor, String descricao, Filial centroCusto, Filial destino, double valor){
        this.id = UUID.randomUUID();
        this.criadaEm = LocalDate.now();
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.centroCusto = centroCusto;
        this.destino = destino;
        this.valor = valor;
    }

    public void pagar(double valor) {
        this.valorPago = valor;
    }

    public double getSaldo() {
        return this.valor - this.valorPago;
    }

    public boolean estaQuitada() {
        if(getSaldo() <= 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Despesa{" +
                "\n\t" + "id=" + id + "," +
                "\n\t" + "criadaEm=" + criadaEm + "," +
                "\n\t" + "fornecedor=" + fornecedor + "," +
                "\n\t" + "descricao='" + descricao + '\'' +
                "\n\t" + "centroCusto=" + centroCusto +
                "\n\t" + "destino=" + destino +
                "\n\t" + "valor=" + valor +
                "\n\t" + "valorPago=" + valorPago +
                "\n}";
    }
}
