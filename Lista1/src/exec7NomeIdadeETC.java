import java.util.Scanner;

public class exec7NomeIdadeETC {

    public static void main(String[] args) {
        // Declaração das variáveis
        String nome; // Nome do usuário
        int idade; // Idade do usuário
        double altura; // Altura do usuário (em metros)
        double peso; // Peso do usuário (em kg)
        String nacionalidade; // Nacionalidade do usuário

        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do usuário
        System.out.print("Digite o seu nome: ");
        nome = scanner.nextLine();

        // Solicita a idade do usuário
        System.out.print("Digite a sua idade: ");
        idade = scanner.nextInt();

        // Solicita a altura do usuário
        System.out.print("Digite a sua altura (em metros): ");
        altura = scanner.nextDouble();

        // Solicita o peso do usuário
        System.out.print("Digite o seu peso (em kg): ");
        peso = scanner.nextDouble();

        // Limpa o buffer do scanner
        scanner.nextLine(); 

        // Solicita a nacionalidade do usuário
        System.out.print("Digite a sua nacionalidade: ");
        nacionalidade = scanner.nextLine();

        // Exibe as informações do usuário
        System.out.println("\nInformações do Usuário:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Nacionalidade: " + nacionalidade);

        scanner.close();
    }
}
