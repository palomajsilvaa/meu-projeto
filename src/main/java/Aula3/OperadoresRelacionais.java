package Aula3;


//Relacionais:
//1- Crie variáveis para as notas de duas alunas. Mostre na tela o resultado de: são iguais, são diferentes, a primeira é maior, a primeira é menor para quando:
//- a = 10, b = 3
//- a = 3, b = 10
//- a = 5, b = 5
//2- Exiba na tela  a == b, sendo a = 10 e b 3.
//3- Exiba na tela a != b, sendo a = 10 e b = 3.
//4- Dado boolean chovendo = true, retorne na tela o resultado de !chovendo

public class OperadoresRelacionais {

    static void main() {

        int a, b;

        a = 10;
        b = 3;
        System.out.println("São iguais? " + (a == b));
        System.out.println("São diferentes? " + (a != b));
        System.out.println("A primeira é maior? " + (a > b));
        System.out.println("A primeira é menor? " + (a < b));


        a = 3;
        b = 10;
        System.out.println("São iguais? " + (a == b));
        System.out.println("São diferentes? " + (a != b));
        System.out.println("A primeira é maior? " + (a > b));
        System.out.println("A primeira é menor? " + (a < b));


        a = 5;
        b = 5;
        System.out.println("São iguais? " + (a == b));
        System.out.println("São diferentes? " + (a != b));
        System.out.println("A primeira é maior? " + (a > b));
        System.out.println("A primeira é menor? " + (a < b));
    }

    static void main2() {
        int a = 10, b = 3;
        System.out.println(a == b);
    }

    static void main3() {

        int a = 10, b = 3;
        System.out.println(a != b);
    }

    static void main4() {
        boolean chovendo = true;
        System.out.println(!chovendo);

    }
}