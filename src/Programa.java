import entities.*;

public class Programa {
    public static void main(String[] args) {

        Endereco endereco1, endereco2, endereco3, endereco4, endereco5, endereco6, endereco7;
        FornecedorFisico fornPF1, fornPF2, fornPF3;
        FornecedorJuridico fornPJ1, fornPJ2, fornPJ3;
        Filial matriz, filial1, filial2;
        Despesa desp1, desp2, desp3;

        endereco1 = new Endereco("01001001", "Praça da Sé", 1, null, "Sé", "São Paulo", "SP");
        endereco2 = new Endereco("04015003", "Rua Joaquim Távora", 1405, null, "Vila Mariana", "São Paulo", "SP");
        endereco3 = new Endereco("04937160", "Rua Manuel Laranjeira", 60, "B", "Jardim Boa Vista", "São Paulo", "SP");
        endereco4 = new Endereco("04937160", "Rua Manuel Laranjeira", 60, "B", "Jardim Boa Vista", "São Paulo", "SP");
        endereco5 = new Endereco("04937160", "Rua Manuel Laranjeira", 60, "B", "Jardim Boa Vista", "São Paulo", "SP");
        endereco6 = new Endereco("04937160", "Rua Manuel Laranjeira", 60, "B", "Jardim Boa Vista", "São Paulo", "SP");
        endereco7 = new Endereco("04937160", "Rua Manuel Laranjeira", 60, "B", "Jardim Boa Vista", "São Paulo", "SP");

        fornPF1 = new FornecedorFisico("13005595005", endereco1, "Jadson Santos");
        fornPF2 = new FornecedorFisico("33463601052", endereco1, "Gabrieli Santos");
        fornPF3 = new FornecedorFisico("33240832062", endereco2, "Marília Fernandes");

        fornPJ1 = new FornecedorJuridico("53535612000145", endereco3, "ACME LTDA", "Acme", "00000000000", "00001");
        fornPJ2 = new FornecedorJuridico("32749198000105", endereco4, "ACME LTDA", "Acme", "00000000000", "00001");
        fornPJ3 = new FornecedorJuridico("26189215000196", endereco5, "ACME LTDA", "Acme", "00000000000", "00001");

        matriz = new Filial("01A", true, "98765432000101", "Matriz", "3451235713", "12356423", end1);
        filial1 = new Filial("01A", true, "98765432000101", "Matriz", "3451235713", "12356423", end1);

        desp1 =  new Despesa(fj1, "Compra de equipamento Eletrônico", fl1, fl1, 1000);
        desp2 =  new Despesa(fj1, "Compra de equipamento Eletrônico", fl1, fl1, 1000);
        desp3 =  new Despesa(fj1, "Compra de equipamento Eletrônico", fl1, fl1, 1000);

        System.out.println(desp1);

    }
}
