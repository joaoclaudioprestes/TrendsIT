public class Aviao extends Carro { // Herança do construtor Carro()
    double envergadura;

    void aterrizar() {
        System.out.println("-----------------_________________________________     :)");
    }

    void acelerar() {// Polimorfismo, ou seja, reescreve a o metodo acelerar definido anteriormente na classe modelo Carro();
        System.out.println("Decolar => ____________________-----------------");
    }
}
