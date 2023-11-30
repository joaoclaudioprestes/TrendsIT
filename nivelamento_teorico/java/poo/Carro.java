import java.util.Random;

public class Carro { // Abstração de uma classe modelo
    int ano;
    String cor;

    public Carro() { // Construtor sem aparametros
        Random gerador = new Random();
        int chassi = gerador.nextInt(1000);
        System.out.println("Chassi: " + chassi);
    }

    public Carro(int ano, String cor) { // Contrutor com parametros
        this.ano = ano;
        this.cor = cor;
        System.out.println("Carro criado e ligado!");
    }

    void ligar() {
        System.out.println("Engine ON ................");
    }

    void desligar() {
        System.out.println("Engine OFF ................");
    }

    void acelerar() {
        System.out.println("Vruuuuuuuunnnnn");
    }
}
