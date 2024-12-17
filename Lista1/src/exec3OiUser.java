import java.util.Scanner;

public class exec3OiUser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do usuário
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        // Exibe a mensagem de saudação
        System.out.println("Olá " + nome);

        scanner.close();
    }
}
