public class Cliente {
    private String cpf;
    private String rg;
    private String nome ;
    private String sobrenome;
    private int NumCliente;


    public Cliente(String nome, String cpf, String sobrenome, int NumCliente, String rg){
        this.nome =nome;
        this.cpf =cpf;
        this.rg = rg;
        this.NumCliente=NumCliente;
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getNumCliente() {
        return NumCliente;
    }

    public void setNumCliente(int numCliente) {
        NumCliente = numCliente;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
