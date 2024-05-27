import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Informe o número da agência onde a conta está sendo criada: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Agora informe o valor que deseja depositar para finalizar a criação da conta: ");
        float saldo = scanner.nextFloat();

        scanner.close();
        System.out.println("Olá " + nome + ", obrigada por criar uma conta em nosso banco, sua agência é " + agencia +  ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");

    }
}
