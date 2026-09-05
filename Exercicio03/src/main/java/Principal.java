import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Livro livro = new Livro();
        CD cd = new CD();

        System.out.println("=== Cadastro do Livro ===");

        System.out.print("Nome do livro: ");
        livro.setNome(scanner.nextLine());

        System.out.print("Preço do livro: ");
        livro.setPreco(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("Autor do livro: ");
        livro.setAutor(scanner.nextLine());


        System.out.println("\n=== Cadastro do CD ===");

        System.out.print("Nome do CD: ");
        cd.setNome(scanner.nextLine());

        System.out.print("Preço do CD: ");
        cd.setPreco(scanner.nextDouble());

        System.out.print("Número de faixas: ");
        cd.setNumFaixas(scanner.nextInt());


        cd.exibeInformacoes();

        scanner.close();
    }
}