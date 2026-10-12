package AtividadeScanner;

import java.util.Scanner;

public class Ex04 {

//4 - Peça um número e mostre a tabuada dele de 1 a 10.

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));

        }
    }
}