package Aula5;

import java.util.Scanner;

//6 - Crie um programa para cadastrar um usuário. Siga exatamente esta ordem:
//Peça para o usuário digitar o seu Ano de Nascimento (leia usando nextInt()).
//Logo em seguida, peça para ele digitar o seu Nome Completo (leia usando nextLine()).
//Por fim, imprima uma mensagem concatenada: "O usuário [NOME] nasceu em [ANO]."

public class Revisao6 {

    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int ano = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Digite o nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("O usuário " + nome + " nasceu no ano de " + ano + ".");

        scanner.close();
    }
}



