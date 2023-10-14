import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            sc.useLocale(Locale.US);

            System.out.println("Por favor, Digite o numero da conta!:");
            int numeroConta = sc.nextInt();

            sc.nextLine();

            System.out.println("Por favor, Digite o numero da agencia!:");
             String numeroAgencia = sc.nextLine();

             System.out.println("Por favor, Digite o seu nome!:");
            String nomeCliente = sc.nextLine();

             System.out.println("Por favor, Digite o seu saldo!:");
            double valorSaldo = sc.nextDouble();

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia
            + ", conta " + numeroConta + " e seu saldo " + valorSaldo + " já está disponível para saque.");
        }




        
        
}
}
