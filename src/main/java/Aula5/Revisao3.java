package Aula5;

//3 - Usando um do-while e um switch, crie um menu interativo. O menu deve oferecer três opções:
//1 - Ver camisas
//2 - Ver calças
//3 - Sair
//Se a pessoa digitar 1 ou 2, exiba uma mensagem confirmando a escolha. Se digitar uma opção inválida, avise. O laço só deve ser quebrado (encerrado) quando a pessoa digitar 3.

import java.util.Scanner;

public class Revisao3 {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("MENU");
            System.out.println("1 - Ver camisas");
            System.out.println("2 - Ver calças");
            System.out.println("3 - ENCERRAR");
            System.out.print("OPÇÃO INVÁLIDA");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("ver camisas");
                    break;
                case 2:
                    System.out.println("ver calças");
                    break;
                case 3:
                    System.out.println("Encerrado");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            System.out.println();
        } while (opcao != 3);


    }
}
