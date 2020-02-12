public class Cheque {
    private String nomeBanco;
    private String data;
    private double valorC;


    public Cheque(String nomeBanco, String nome, String sobrenome, String cpf, String data, int numCliente, double valor) {
        this.nomeBanco = nomeBanco;
        this.data = data;
        this.valorC = valor;

    }


    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    public double getValor() {
        return valorC;
    }

    public void setValor(double valor) {
        this.valorC = valor;
    }


}
