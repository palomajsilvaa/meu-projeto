package Aula5;

import java.util.Scanner;

public class Produto {

    String nome = "Celular";
    double preco = 3.600;

    static void main() {

        Scanner scanner = new Scanner(System.in);



        for (int i = 1; i <= 3; i++) {

            Produto produto = new Produto();
            System.out.print("Nome: ");
            produto.nome = scanner.nextLine();

            System.out.print("Preço: ");
            produto.preco = scanner.nextDouble();
            scanner.nextLine();

            if (produto.preco > 100) {
                System.out.printf("%s custa R$ %.2f - Produto caro!%n",
                        produto.nome, produto.preco);
            } else {
                System.out.printf("%s custa R$ %.2f - Produto com preço acessível!%n",
                        produto.nome, produto.preco);
            }
        }

        scanner.close();
    }

        }

