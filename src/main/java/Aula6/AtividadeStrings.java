package Aula6;

public class AtividadeStrings {

    //1 — Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).
    static void main() {
        String filha = "Agnes Ramona";
        System.out.println(filha);
    } //nome

    static void main1() {
        String filha = "Agnes Ramona";
        System.out.println(filha.length());

    }//12

    //2 — Peça o nome da pessoa e mostre ele todo em MAIÚSCULO e todo em minúsculo
    static void main2() {
        String filha = "Agnes Ramona";
        System.out.println(filha.toUpperCase());
    }//AGNES RAMONA

    static void main3() {
        String filha = "Agnes Ramona";
        System.out.println(filha.toLowerCase());
    }//agnes ramona

    //3 — Peça o nome da pessoa e mostre a primeira letra dele.
    static void main4() {
        String filha = "Agnes Ramona";
        System.out.println(filha.charAt(0));
    }//A

    //4 — Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.
    static void main5() {
        String frase = "Estou aprendendo Java, e estou achando muito dificil";
        System.out.println(frase.equals("fácil"));
    }//false

    //5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.
    static void main6() {
        String nomedapessoa = "Agnes RAMONA";
        System.out.println(nomedapessoa.equalsIgnoreCase("Agnes RAMONA"));
    }//true

}

//Rodei todos os casos e foram concluídos com sucesso, mas deixei todos na mesma Class :)