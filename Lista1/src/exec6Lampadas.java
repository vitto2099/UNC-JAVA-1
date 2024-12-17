import java.util.Scanner;

public class exec6Lampadas {

    public static void main(String[] args) {
        // Declaração das variáveis
        int numeroLampadas; // Número de lâmpadas necessárias
        double potenciaLampada; // Potência da lâmpada (em watts)
        double largura; // Largura do cômodo (em metros)
        double comprimento; // Comprimento do cômodo (em metros)
        double area; // Área do cômodo
        double potenciaNecessaria; // Potência total necessária

        Scanner scanner = new Scanner(System.in);

        // Solicita a potência da lâmpada
        System.out.print("Potência da lâmpada (em watts): ");
        potenciaLampada = scanner.nextDouble();

        // Solicita as dimensões do cômodo
        System.out.print("Largura do cômodo (em metros): ");
        largura = scanner.nextDouble();
        System.out.print("Comprimento do cômodo (em metros): ");
        comprimento = scanner.nextDouble();

        // Calcula a área do cômodo
        area = largura * comprimento;

        // Calcula a potência total necessária
        potenciaNecessaria = 18 * area;

        // Calcula o número de lâmpadas necessárias
        numeroLampadas = (int) Math.ceil(potenciaNecessaria / potenciaLampada);

        // Exibe o número de lâmpadas necessárias
        System.out.println("Número de lâmpadas necessárias: " + numeroLampadas);

        scanner.close();
    }
}
