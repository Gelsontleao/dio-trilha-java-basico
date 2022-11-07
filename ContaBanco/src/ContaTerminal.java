import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Instanciando e criando um objeto Scanner
        Scanner sc = new Scanner(System.in);

        //Variáveis
        int numero;
        String agencia, nomeCliente;
        double saldo;
        
        System.out.print("Por favor, digite o número da Agência: ");
        agencia = sc.next();

        System.out.print("Por favor, digite o número da sua Conta: ");
        numero = sc.nextInt();

        System.out.print("Por favor, digite o seu Nome: ");
        nomeCliente = sc.next();

        System.out.print("Por favor, digite o Saldo Inicial: R$ ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
    }
}
