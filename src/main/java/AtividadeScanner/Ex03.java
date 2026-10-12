package AtividadeScanner;

import java.util.Scanner;

public class Ex03 {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da aluna: ");
        double nota = scanner.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprovada");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("ReproVvada");
        }

        scanner.close();

    }
}
