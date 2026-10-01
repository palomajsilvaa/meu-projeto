package Aula2;

public class Aritméticos02 {

    static void main() {

        // 2- Crie variáveis para dois números decimais de valor a = 10 e b = 3 e mostre na tela: soma, subtração, multiplicação, divisão e resto.

        double p = 10.0;
        double m = 3.0;
        double soma = p + m;
        double subtracao = p - m;
        double multiplicacao = p * m;
        double divisao = p / m;
        double resto = p % m;

        soma = p + m;
        System.out.println("O resultado é " + soma);

        subtracao = p - m;
        System.out.println(subtracao);

        multiplicacao = p * m;
        System.out.println(multiplicacao);

        divisao = p / m;
        System.out.println(divisao);

        resto = p % m;
        System.out.println(resto);


    }
}
