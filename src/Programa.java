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
        endereco3 = new Endereco("03105003", "Avenida do Estado", 5533, null, "Cambuci", "São Paulo", "SP");
        endereco4 = new Endereco("01310000", "Avenida Paulista", 100, "Conjunto 10", "Bela Vista", "São Paulo", "SP");
        endereco5 = new Endereco("01504000", "Rua Vergueiro", 60, "Bloco A", "Liberdade", "São Paulo", "SP");
        endereco6 = new Endereco("03101005", "Avenida Alcântara Machado", 4188, null, "Quarta Parada", "São Paulo", "SP");
        endereco7 = new Endereco("04937160", "Rua Manuel Laranjeira", 60, "B", "Jardim Boa Vista", "São Paulo", "SP");

        fornPF1 = new FornecedorFisico("13005595005", endereco1, "Jadson Santos");
        fornPF2 = new FornecedorFisico("33463601052", endereco1, "Gabrieli Santos");
        fornPF3 = new FornecedorFisico("33240832062", endereco2, "Marília Fernandes");

        fornPJ1 = new FornecedorJuridico("53535612000145", endereco3, "ACME LTDA", "Acme", "000000000", "00000000001");
        fornPJ2 = new FornecedorJuridico("32749198000105", endereco4, "JOHN DOE MATERIAIS PARA ESCRITÓRIO EIRELI", "JD OFFICE", "111111111", "00000000002");
        fornPJ3 = new FornecedorJuridico("26189215000196", endereco5, "CARAMELO COFFEE LTDA", "CARAMELO", "222222222", "00000000003");

        matriz = new Filial("M01", true, "98765432000101", "Matriz", "123456789", "12345678900", endereco6);
        filial1 = new Filial("F02", true, "98765432001102", "Filial Shopping Master Piso-Terreo", "987654321", "00987654321", endereco7);
        filial2 = new Filial("F03", true, "32332213000101", "Franquia Shopping Master Piso-Cinema", "192837465", "0918374650", endereco7);

        desp1 =  new Despesa(fornPF1, "Salário do Funcionário", matriz, filial1, 2000);
        desp2 =  new Despesa(fornPJ1, "Compra de computador para ediçao", matriz, matriz, 6399.9);
        desp3 =  new Despesa(fornPJ2, "Compra de material para escritório", matriz, filial2, 545.32);

        System.out.println(desp1 + "\n");
        System.out.println(desp2 + "\n");
        System.out.println(desp3 + "\n");

    }
}
