import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void criarConta(String nomeDoCliente, String agencia, int numero, float saldo) {
        System.out.printf("\nOlá, %s. Obrigado por criar uma conta em nosso banco!\nSua agência é %s, conta %d, e seu saldo %.2f já está disponível para saque.\n", nomeDoCliente, agencia, numero, saldo);
    }



    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        // Abrindo a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Recebendo nome do cliente
        System.out.print("Por favor, digite o seu nome completo: ");
        String nomeDoCliente = scanner.nextLine();

        // Recebendo número da agência
        System.out.print("Por favor, digite o número da sua agência: ");
        String agencia = scanner.nextLine();

        // Recebendo número da conta
        System.out.print("Por favor, digite o número da sua conta: ");
        int numero = scanner.nextInt();

        // Saldo do cliente
        System.out.print("Por favor, digite o seu saldo: ");
        float saldo = scanner.nextFloat();
        


        // Print
        criarConta(nomeDoCliente, agencia, numero, saldo);

        scanner.close();
    }

}


