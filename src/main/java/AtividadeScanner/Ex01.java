package AtividadeScanner;

import java.util.Scanner;

public class Ex01 {

    static void main() {
        //1 - Peça o nome da pessoa e a idade dela. Exemplo: "Oi Ana, você tem 28 anos e vai fazer 29 no próximo aniversário."

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Oi " + nome + ", você tem " + idade +
                " anos e vai fazer " + (idade + 1) + " no próximo aniversário.");

        scanner.close();
    }
}


