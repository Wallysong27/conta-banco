import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta:");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o número da agência:");
        String agencia = sc.nextLine();

        System.out.println("Por favor, informe o nome do cliente:");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, informe o saldo:");
        while (!sc.hasNextDouble()) {
            System.out.println("Entrada inválida. Por favor, digite um número válido para o saldo. Exemplo: 100.00");
            sc.next();
        }
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        sc.close();
    }
}
