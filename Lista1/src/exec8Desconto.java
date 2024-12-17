import java.util.Scanner;

public class exec8Desconto {

    public static void main(String[] args) {
        // Declaração das variáveis
        String nomeProduto; // Nome do produto
        int quantidade; // Quantidade comprada
        double valorUnitario; // Valor unitário do produto
        double percentualDesconto; // Percentual de desconto
        double valorTotal; // Valor total da venda sem desconto
        double valorComDesconto; // Valor total da venda com desconto

        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do produto
        System.out.print("Digite o nome do produto: ");
        nomeProduto = scanner.nextLine();

        // Solicita a quantidade comprada
        System.out.print("Digite a quantidade comprada: ");
        quantidade = scanner.nextInt();

        // Solicita o valor unitário
        System.out.print("Digite o valor unitário do produto (em reais): ");
        valorUnitario = scanner.nextDouble();

        // Solicita o percentual de desconto
        System.out.print("Digite o percentual de desconto (em %): ");
        percentualDesconto = scanner.nextDouble();

        // Calcula o valor total da venda sem desconto
        valorTotal = quantidade * valorUnitario;

        // Calcula o valor com desconto
        valorComDesconto = valorTotal - (valorTotal * percentualDesconto / 100);

        // Exibe o nome do produto e o valor total da venda com desconto
        System.out.println("\nProduto: " + nomeProduto);
        System.out.println("Valor total da venda com desconto: R$ " + valorComDesconto);

        scanner.close();
    }
}
