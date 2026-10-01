package Aula5;

//1 - Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele. Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00. No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais. Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"

import java.util.Scanner;

public class Revisão001 {

    static void main() {

        String nomedolanche;
        double valor;
        Scanner lanchinho = new Scanner(System.in);
        valor = lanchinho.nextDouble();
        System.out.println(valor);
        lanchinho.nextLine();

        nomedolanche = lanchinho.nextLine();
        System.out.println(nomedolanche);







    }
}
