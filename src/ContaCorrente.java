public class ContaCorrente extends Conta {
    private double Limite;

    public ContaCorrente(double saldo, Cliente cliente, double limite) {
        super(saldo, cliente);
        this.Limite = limite;
    }

    @Override
    public String saque(double valor) {
        double saldo = getSaldo();
        if (saldo >= valor){
            saldo -= valor;
            setSaldo(saldo);
        } else if (valor <= (saldo + this.Limite)){
            double diferenca = saldo - valor;
            this.Limite -= diferenca;
            setSaldo(saldo - valor);

        }else{
            System.out.println("Chore!");
        }


        return super.saque(valor);
    }
    public void DepositoCheque(double valorC,String nomeBanco,String data,boolean Cruzado){
        deposito(valorC);
        System.out.println(nomeBanco);
        System.out.println(data);
    }
}