import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo da conta:");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar a conta em nosso banco, " + "sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponivél para saque.";

        System.out.println(mensagem);

        scanner.close();

    }
}
 