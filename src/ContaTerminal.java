import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o número da conta: ");
        int conta = ler.nextInt();

        System.out.print("Digite sua agencia: ");
        String agencia = ler.next();
        ler.nextLine();

        System.out.print("Digite seu nome: ");
        String nomeCliente = ler.nextLine();

        System.out.print("Digite o saldo: ");
        double saldo = ler.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s," +
                        " conta %d e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, conta, saldo);

    }
}
