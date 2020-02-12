public class Main {
    public static void main(String[] args) {
            Cliente cliente1 = new Cliente("Christian", "76378637" ,"Luan",7837,"62567253623");
            ContaPoupanca CP= new ContaPoupanca(10,cliente1,0.005);
            CP.saque(150);
            CP.deposito(0);
            CP.recolherJuros();
            ContaCorrente CC =new ContaCorrente(9,cliente1,200);
            CC.saque(20);
            CC.deposito(5);
            Cheque cheque=new Cheque("brasil","christian","luan" ,"723672372837","12/02/2020",623563,2);
        }
    }




//  ivo ivo = new ivo();
//  Superman superman = new Superman();
//  Batman Batman = new Batman();
//  ivo.salvarPessoas();
//  superman.salvarPessoas();
// Batman.salvarPessoas();







//  Cachorro cachorro1 =new Cachorro("Pitbull", 2);
//cachorro1.setRaca("Pitbull");

//Cachorro cachorro2 =new Cachorro("Ladrao",1);
// cachorro2.setRaca("Ladrao");

//  Baleia baleia1 = new Baleia();
//  baleia1.setRaca("Orca");

//  Onca onca1 = new Onca();
// onca1.setTemPinta(false);

//  System.out.println(cachorro1.getRaca());
//  System.out.println(baleia1.getRaca());
//  System.out.println(onca1.getTemPinta());





// Medico Tobias = new Medico();
//  Tobias.salario = Tobias.calcularSalario(70,150);
//   System.out.println(Tobias.salario);
//   Veterinario Jose =new Veterinario();
//   Jose.salario =Jose.calcularSalario(80,120);
//  System.out.println(Jose.salario);
//   Advogado Tonho = new Advogado();
//  Tonho.salario = Tonho.calcularSalario(90,200);
// System.out.println(Tonho.salario);




//public static void main(String [] args){
//Cachorro Jonas = new Cachorro();
// Baleia Willy= new Baleia();
//  Onca Pinta= new Onca();

// Jonas.brincar();
// System.out.println(Jonas.brincar());
// System.out.println(Willy.nadar());
// System.out.println(Pinta.comer());
//   int numero1 =5;
//  int numero2 = 6;
//   System.out.println(numero1+numero2);