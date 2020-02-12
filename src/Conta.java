public class Conta {
    private double saldo;
    private Cliente cliente;
    private Cheque cheque;

    //    private double ConsultaSaldo;
    public Conta() {

    }

    public Conta(double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public String saque(double valor) {
        if (saldo >= valor) {
            this.saldo -= valor;
            return "seu saldo =" + saldo;
        } else {
            return "saldo insuficiente";
        }

    }

    public void deposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Deposito realizado com sucesso ");
        } else {
            System.out.println("valor invalido para depositar");
        }


    }

    public void ConsultaSaldo (){
        System.out.println("Saldo Atual" + this.saldo);
    }

    public void DepositoCheque (double valorC) {
        if (valorC > 0) {
            this.saldo += valorC;
            System.out.println("Deposito realizado com sucesso ");
        } else {
            System.out.println("valor invalido para depositar");
        }


    }
        public double getSaldo () {
            return saldo;
        }

        public void setSaldo ( double saldo){
            this.saldo = saldo;
        }

        public Cliente getCliente () {
            return cliente;
        }

        public void setCliente (Cliente cliente){
            this.cliente = cliente;
        }



}

