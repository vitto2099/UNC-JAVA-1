import java.util.Scanner;

public class exec9RealParaDolar {

    public static void main(String[] args) {
        // Declaração das variáveis
        double valorReais; // Valor em reais
        double cotacaoDolar; // Cotação do dólar
        double valorDolares; // Valor em dólares

        Scanner scanner = new Scanner(System.in);

        // Solicita o valor em reais
        System.out.print("Digite o valor em reais: ");
        valorReais = scanner.nextDouble();

        // Solicita o valor da cotação do dólar
        System.out.print("Digite o valor da cotação do dólar: ");
        cotacaoDolar = scanner.nextDouble();

        // Calcula o valor equivalente em dólares
        valorDolares = valorReais / cotacaoDolar;

        // Exibe o valor em dólares
        System.out.println("Valor equivalente em dólares: $ " + valorDolares);

        scanner.close();
    }
}
