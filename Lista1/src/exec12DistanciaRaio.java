import java.util.Scanner;

public class exec12DistanciaRaio {

    public static void main(String[] args) {
        // Declaração das variáveis
        double tempoSegundos; // Tempo em segundos entre ver o raio e ouvir o trovão
        double velocidadeSom = 340; // Velocidade do som em m/s
        double distanciaMetros; // Distância em metros
        double distanciaQuilometros; // Distância em quilômetros

        Scanner scanner = new Scanner(System.in);

        // Solicita o tempo em segundos
        System.out.print("Digite o tempo em segundos entre ver o raio e ouvir o trovão: ");
        tempoSegundos = scanner.nextDouble();

        // Calcula a distância em metros
        distanciaMetros = tempoSegundos * velocidadeSom;

        // Converte a distância para quilômetros
        distanciaQuilometros = distanciaMetros / 1000;

        // Exibe a distância em quilômetros
        System.out.printf("A distância até o raio é de aproximadamente %.2f km%n", distanciaQuilometros);

        scanner.close();
    }
}
