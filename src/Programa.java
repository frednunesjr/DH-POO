import entities.*;

public class Programa {
    public static void main(String[] args) {

        FornecedorFisico ff1;
        FornecedorJuridico fj1;
        Filial fl1;
        Endereco end1;
        Despesa desp1;

        end1 = new Endereco("01001001", "Praça da Sé", 1, null, "Sé", "Sâo Paulo", "SP");
        ff1 = new FornecedorFisico("12345678900", end1, "Fredson Nunes Junior");
        fl1 = new Filial("01A", true, "98765432000101", "Matriz", "3451235713", "12356423", end1);
        fj1 = new FornecedorJuridico("123456789000101", end1, "ACME LTDA", "Acme", "00000000000", "00001");
        desp1 =  new Despesa(fj1, "Compra de equipamento Eletrônico", fl1, fl1, 1000);

        System.out.println(desp1);

    }
}
