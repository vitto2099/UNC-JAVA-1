import java.util.Scanner;

public class exec4ContaDeLuz {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a quantidade de Kilowatts consumidos
        System.out.print("Digite a quantidade de Kilowatts consumidos: ");
        double kilowattsConsumidos = scanner.nextDouble();

        // Valor do Kilowatt
        double valorPorKilowatt = 0.55;

        // Calcula o valor total da conta de luz
        double valorConta = kilowattsConsumidos * valorPorKilowatt;

        // Exibe o valor da conta de luz
        System.out.println("O valor da conta de luz é: R$ " + valorConta);

        scanner.close();
    }
}