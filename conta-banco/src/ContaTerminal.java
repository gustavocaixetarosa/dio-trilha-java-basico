import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%nBem-vindo ao criador de contas bancárias!%n%n");


        System.out.println("    Digite o número da conta: ");
        int numeroDaConta = scanner.nextInt();

        System.out.println("    Digite o número da agência: ");
        String numeroDaAgencia = scanner.next();

        scanner.nextLine();

        System.out.println("    Informe o nome do titular: ");
        String nomeDoCliente = scanner.nextLine();

        System.out.println("    Por último, informe o saldo atual da conta: ");
        double saldoDaConta = scanner.nextDouble();

        scanner.close();

        System.out.printf("%nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s conta %s e seu saldo R$%.2f já está disponível para saque.%n",     
                nomeDoCliente, numeroDaAgencia, numeroDaConta, saldoDaConta);
    }
}
