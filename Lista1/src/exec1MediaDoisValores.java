import java.util.Scanner;

public class exec1MediaDoisValores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o primeiro valor
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        // Solicita ao usuário o segundo valor
        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        // Calcula a média dos dois valores
        double media = (valor1 + valor2) / 2;

        // Exibe a média na tela
        System.out.println("A média dos dois valores é: " + media);

        scanner.close();
    }
}
