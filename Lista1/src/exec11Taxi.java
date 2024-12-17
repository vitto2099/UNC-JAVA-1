import java.util.Scanner;

public class exec11Taxi {

    public static void main(String[] args) {
        // Declaração das variáveis
        double marcacaoInicio; // Marcação do odômetro no início do dia (em Km)
        double marcacaoFim; // Marcação do odômetro no final do dia (em Km)
        double litrosGastos; // Número de litros de combustível gasto
        double valorTotalRecebido; // Valor total recebido dos passageiros (em R$)
        double precoCombustivel = 1.90; // Preço do combustível (em R$ por litro)
        double mediaConsumo; // Média de consumo em Km/L
        double custoCombustivel; // Custo total do combustível
        double lucroLiquido; // Lucro líquido do dia

        Scanner scanner = new Scanner(System.in);

        // Solicita a marcação do odômetro no início do dia
        System.out.print("Digite a marcação do odômetro no início do dia (em Km): ");
        marcacaoInicio = scanner.nextDouble();

        // Solicita a marcação do odômetro no final do dia
        System.out.print("Digite a marcação do odômetro no final do dia (em Km): ");
        marcacaoFim = scanner.nextDouble();

        // Solicita o número de litros de combustível gasto
        System.out.print("Digite o número de litros de combustível gasto: ");
        litrosGastos = scanner.nextDouble();

        // Solicita o valor total recebido dos passageiros
        System.out.print("Digite o valor total recebido dos passageiros (em R$): ");
        valorTotalRecebido = scanner.nextDouble();

        // Calcula a média de consumo em Km/L
        mediaConsumo = (marcacaoFim - marcacaoInicio) / litrosGastos;

        // Calcula o custo total do combustível
        custoCombustivel = litrosGastos * precoCombustivel;

        // Calcula o lucro líquido do dia
        lucroLiquido = valorTotalRecebido - custoCombustivel;

        // Exibe a média de consumo e o lucro líquido
        System.out.printf("Média de consumo: %.2f Km/L%n", mediaConsumo);
        System.out.printf("Lucro líquido do dia: R$ %.2f%n", lucroLiquido);

        scanner.close();
    }
}
