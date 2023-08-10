import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência.");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite o número da sua conta bancária.");
        String numeroConta = scanner.next();

        System.out.println("Por favor, digite o seu nome");
        String nomeClient = scanner.next();

        System.out.println("Por favor, quanto deseja sacar");
        double sacarSaldo = scanner.nextDouble();

        System.out.println("Olá " + nomeClient +  ",obrigado por criar uma conta "+
                "em nosso banco, sua agência é " + numeroAgencia + ", 2conta "
                + numeroConta + " e seu saldo "  + sacarSaldo +
                " já está disponível para saque.");
    }
}