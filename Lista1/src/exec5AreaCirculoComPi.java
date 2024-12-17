import java.util.Scanner;

public class exec5AreaCirculoComPi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o raio do círculo
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        // Calcula a área do círculo
        double area = 3.14159 * raio * raio;

        // Exibe a área do círculo
        System.out.println("A área do círculo é: " + area);

        scanner.close();
    }
}
