package Aula5;

import java.util.Scanner;

public class DESAFIO7 {

    static void main() {

        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 2) {

            System.out.println("\nDeseja iniciar?");
            System.out.println("Pressione 1 para continuar");
            System.out.println("Pressione 2 para sair");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    Aluna aluna = new Aluna();

                    System.out.print("Nota 1: ");
                    aluna.nota = sc.nextDouble();

                    System.out.print("Nota 2: ");
                    aluna.nota2 = sc.nextDouble();

                    aluna.media = (aluna.nota + aluna.nota2) / 2;

                    if (aluna.media >= 6) {
                        aluna.passou = true;
                    } else {
                        aluna.passou = false;
                    }

                    sc.nextLine();

                    System.out.print("Nome da Aluna: ");
                    aluna.nome = sc.nextLine();

                    System.out.printf(
                            "\nO nome da aluna é %s, sua primeira nota foi %.1f, sua segunda nota foi %.1f, sua média final foi %.1f. Aluna aprovada: %b%n",
                            aluna.nome,
                            aluna.nota,
                            aluna.nota2,
                            aluna.media,
                            aluna.passou
                    );

                    break;

                case 2:

                    System.out.println("Encerrando o sistema. Até logo!");
                    break;

                default:

                    System.out.println("Opção inválida.");
                    break;
            }
        }

        sc.close();
    }

}

