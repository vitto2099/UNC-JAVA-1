import java.util.Scanner;

public class exec2AreaTrapezio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos valores
        System.out.print("Digite o valor da Base Maior: ");
        double baseMaior = scanner.nextDouble();

        System.out.print("Digite o valor da Base Menor: ");
        double baseMenor = scanner.nextDouble();

        System.out.print("Digite o valor da Altura: ");
        double altura = scanner.nextDouble();

        // Cálculo da área do trapézio
        double area = (baseMaior + baseMenor) * altura / 2;

        // Exibe o resultado
        System.out.println("A área do trapézio é: " + area);
    }
}
