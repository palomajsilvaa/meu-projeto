package Aula2;
public class Aritméticos01 {

    static void main() {

        System.out.println("2 + 2 = " + 2 + 2);
        System.out.println("2 + 2 = " + (2 + 2));


        // Resultado diferente por conta dos parenteses dentro da segunda conta. Primeiro está concatenando e o segundo está somando.


        //1- Crie variáveis para dois números inteiros de valor a = 10 e b = 3 e mostre na tela: soma, subtração, multiplicação, divisão e resto.

        int a = 10;
        int b = 3;
        int soma = 0;
        int subtracao = 0;
        int multiplicacao;
        int divisao;
        int resto;


        soma = a + b;
        System.out.println("O resultado é " + soma);

        subtracao = a - b;
        System.out.println(subtracao);

        multiplicacao = a * b;
        System.out.println(multiplicacao);

        divisao = a / b;
        System.out.println(divisao);

        resto = a % b;
        System.out.println(resto);


    }    }