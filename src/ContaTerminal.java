import java.util.Scanner;


public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;


        System.out.println("Por favor, digite o número da Conta:");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome Completo:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        saldo = scanner.nextDouble();


        System.out.println("\n----------------------------------------------------");
        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco," + " sua agência é "+ agencia + ", conta " + numero +" e seu saldo " +String.format("%.2f", saldo) +" já está disponível para saque");
        System.out.println("----------------------------------------------------");

        scanner.close();
    }
}