package entities;

public class Endereco {
    private String cep;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;

    public Endereco(String cep, String logradouro, int numero, String complemento, String bairro, String cidade, String uf) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "\n\t cep='" + cep + "\'," +
                "\n\t logradouro='" + logradouro + "\'," +
                "\n\t numero=" + numero +
                "\n\t complemento='" + complemento + "\'," +
                "\n\t bairro='" + bairro + "\'," +
                "\n\t cidade='" + cidade + "\'," +
                "\n\t uf='" + uf + "\'," +
                "\n}";
    }
}
