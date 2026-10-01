package Aula6;

public class AtividadeArrays {

    public static void main(String[] args) {

        main1();
        main2();
        main3();
        main4();

    }
    static void main1() {
        //1 — Crie um array com os nomes de 5 pessoas. Mostre o primeiro, o terceiro e o último.

        String[] alunas = {"Mariana", "Laura", "Alice", "Olivia", "Sarah"};
        System.out.println(alunas[0]);
        System.out.println(alunas[2]);
        System.out.println(alunas[4]);

    }
    static void main2() {
        //2 — Crie um array com as notas {8, 6, 10, 7, 9}. Usando um laço, mostre todas, uma por linha, assim: "Nota 1: 8".

        int[] notas = {8, 6, 10, 7, 9};

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + notas[i]);
        }
    }


    static void main3() {
        //3 — Com o mesmo array de notas, calcule e mostre a soma e a média.

        int[] notas = {8, 6, 10, 7, 9};

        int soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = (double) soma / notas.length;

        System.out.println(" A MMédia das notas É: " + media);
    }

    static void main4() {
        //4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.

        int[] numeros = {4, 12, 15, 27, 30};

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);


        }
    }
}




