
import java.util.Scanner;

public class ContaTerminal {
    private String numeroAgencia;
    private String numeroConta;
    private String titular;
    private double saldo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaTerminal conta = new ContaTerminal();

        System.out.println("Digite o numero da agência:");
        conta.numeroAgencia = scanner.nextLine();

        System.out.println("Digite o numero da conta:");
        conta.numeroConta = scanner.nextLine();

        System.out.println("Digite o nome do titular:");
        conta.titular = scanner.nextLine();

        System.out.println("Digite o saldo:");
        conta.saldo = scanner.nextDouble();

        System.out.println("Olá "+conta.titular+", obrigado por criar uma conta em nosso banco, sua agência é "+conta.numeroAgencia+", conta "+conta.numeroConta+" e seu saldo "+conta.saldo+" já está disponível para saque");
        
    }


}