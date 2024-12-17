import java.util.Scanner;

public class exec10Azulejos {

    public static void main(String[] args) {
        // Declaração das variáveis
        double comprimento; // Comprimento da cozinha (em metros)
        double largura; // Largura da cozinha (em metros)
        double altura; // Altura da cozinha (em metros)
        double areaTotalParedes; // Área total das paredes
        double areaPorCaixa = 1.5; // Área coberta por cada caixa de azulejos (em m²)
        double quantidadeCaixas; // Quantidade de caixas necessárias

        Scanner scanner = new Scanner(System.in);

        // Solicita as dimensões da cozinha
        System.out.print("Digite o comprimento da cozinha (em metros): ");
        comprimento = scanner.nextDouble();
        System.out.print("Digite a largura da cozinha (em metros): ");
        largura = scanner.nextDouble();
        System.out.print("Digite a altura da cozinha (em metros): ");
        altura = scanner.nextDouble();

        // Calcula a área total das paredes (4 paredes)
        areaTotalParedes = 2 * (comprimento * altura) + 2 * (largura * altura);

        // Calcula a quantidade de caixas de azulejos necessárias
        quantidadeCaixas = areaTotalParedes / areaPorCaixa;

        // Arredonda para cima, pois não é possível comprar uma fração de caixa
        quantidadeCaixas = Math.ceil(quantidadeCaixas);

        // Exibe a quantidade de caixas necessárias
        System.out.println("Quantidade de caixas de azulejos necessárias: " + (int)quantidadeCaixas);

        scanner.close();
    }
}
