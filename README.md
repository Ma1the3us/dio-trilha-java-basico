# ContaBanco

Projeto simples em Java que simula a criação de uma conta bancária via terminal, solicitando dados do usuário e exibindo uma mensagem de confirmação.

## Descrição

A aplicação coleta as seguintes informações pelo terminal:

- Número da conta
- Código da agência
- Nome completo do cliente
- Saldo inicial

Após a entrada dos dados, o sistema exibe uma mensagem informando que a conta foi criada com sucesso e que o saldo já está disponível para saque.

Projeto com foco educacional, indicado para iniciantes em Java.

## Tecnologias Utilizadas

- Java (JDK 8 ou superior)
- Scanner
- BigDecimal
- Locale.US




## Código Fonte

```java
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
        scanner.nextLine(); // limpa o buffer
        String NomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta");
        BigDecimal Saldo = scanner.nextBigDecimal();

        System.out.println(
            "Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
            + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque."
        );
    }
}
``` 
# Licença

Projeto livre para fins educacionais.

