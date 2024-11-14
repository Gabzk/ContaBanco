import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Garantir formato numérico consistente
        Locale.setDefault(Locale.US);
        
        // Inicializar o scanner usando try-with-resources
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Por favor, digite o número da Conta:");
            int numero = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha

            System.out.println("Por favor, digite o número da Agência:");
            String agencia = sc.nextLine();

            System.out.println("Por favor, digite o nome do Cliente:");
            String nomeCliente = sc.nextLine();

            System.out.println("Por favor, digite o Saldo:");
            double saldo = sc.nextDouble();

            // Mensagem formatada em uma única variável
            String mensagem = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco!%n" +
                "Sua agência é %s, conta %d, e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, numero, saldo
            );

            // Exibir mensagem
            System.out.println(mensagem);
        }
    }
}
