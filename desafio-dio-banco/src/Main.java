
public class Main {
	
	public static void main(String[] args) {
		
		Cliente gelson = new Cliente();
		gelson.setNome("Gelson Theodoro Leão");
		Conta cc = new ContaCorrente(gelson);
		cc.depositar(100);		
		Conta cp = new ContaPoupanca(gelson);
		cc.transferir(80, cp);
		
		Cliente joao = new Cliente();
		joao.setNome("João da Silva");
		Conta cc1 = new ContaCorrente(joao);
		cc1.depositar(110);		
		Conta cp1 = new ContaPoupanca(joao);
		cc1.transferir(80, cp1);
		
		Cliente maria = new Cliente();
		maria.setNome("Maria do Rosário");
		Conta cc2 = new ContaCorrente(maria);
		cc2.depositar(110);		
		Conta cp2 = new ContaPoupanca(maria);
		cc2.transferir(80, cp2);
		
		Cliente viviane = new Cliente();
		viviane.setNome("Viviane Martins");
		Conta cc3 = new ContaCorrente(viviane);
		cc3.depositar(110);		
		Conta cp3 = new ContaPoupanca(viviane);
		cc3.transferir(80, cp3);
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silva");
		Conta cc4 = new ContaCorrente(paulo);
		cc4.depositar(100);		
		Conta cp4 = new ContaPoupanca(paulo);
		cc4.transferir(80, cp4);
		
		Cliente manoel = new Cliente();
		manoel.setNome("Manoel de Oliveira");
		Conta cc5 = new ContaCorrente(manoel);
		cc5.depositar(100);		
		Conta cp5 = new ContaPoupanca(manoel);
		cc5.transferir(80, cp5);
		
		cc.imprimirInfosComuns();
		
	}

}
