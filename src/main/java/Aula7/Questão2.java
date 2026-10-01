package Aula7;

public class Questão2 {

    public static void main(String[] args) {
        // Chamando o método saudar da classe Utilidades
        Utilidades.saudar("Ana");
        Utilidades.saudar("Carlos");
        Utilidades.saudar("Mariana");
    }

    static class Utilidades {
        public static void saudar(String nome) {
            System.out.println("Olá, " + nome + "! Tudo bem?");
        }
    }
}

