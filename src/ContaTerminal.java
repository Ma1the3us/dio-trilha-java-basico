import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da sua conta");
        int Numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o código da agência");
        String Agencia = scanner.next();
        
        System.out.println("Por favor, digite o seu Nome Completo");
        scanner.nextLine(); 
        String NomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo da Conta");
        BigDecimal Saldo = scanner.nextBigDecimal();

        System.out.println("Olá " + NomeCliente + ", " + "obrigado por criar uma conta em nosso banco, sua agência é "
                          + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");

    }
}