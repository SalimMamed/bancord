public class ContaPoupanca extends Conta{
    private double TaxaRendimento;


    public ContaPoupanca(double saldo, Cliente cliente, double taxaRendimento) {
        super(saldo, cliente);
        this.TaxaRendimento = taxaRendimento;
    }

    public void recolherJuros(){
        double JurosBancarios = this.getSaldo()*TaxaRendimento;
        this.setSaldo(this.getSaldo()+JurosBancarios);
        System.out.println("taxa de rendimento="+JurosBancarios);
        System.out.println("saldo atualizado é R$" +getSaldo());
    }
}


