package Aula5;

//1 - Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele. Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00. No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais. Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"

import java.util.Scanner;

public class Revisao1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String lanche = "Xis-Bacon";

        System.out.print(28.50);
        double preco = sc.nextDouble();
        double desconto = 5.00;


        if (preco > 30.00) {
            preco -= desconto;
        }

        System.out.printf("O lanche %s custa R$ %.2f%n", lanche, preco);

    }
}
