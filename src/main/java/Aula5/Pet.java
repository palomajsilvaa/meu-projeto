package Aula5;

public class Pet {

    public String nome;
    public String raca;
    public double peso;


    static void main() {

        // Cachorro
        Pet cachorro = new Pet();
        cachorro.nome = "Texas";
        cachorro.raca = "Labrador";
        cachorro.peso = 20.6;

        // Gato
        Pet gato = new Pet();
        gato.nome = "Black";
        gato.raca = "Persa";
        gato.peso = 3.8;


        System.out.println("Pet 1:");
        System.out.println("Nome: " + cachorro.nome);
        System.out.println("Raça: " + cachorro.raca);
        System.out.println("Peso: " + cachorro.peso + " kg");

        System.out.println();

        System.out.println("Pet 2:");
        System.out.println("Nome: " + gato.nome);
        System.out.println("Raça: " + gato.raca);
        System.out.println("Peso: " + gato.peso + " kg");
    }
}



