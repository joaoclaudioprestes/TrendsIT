public class Fusca {
    public static void main(String[] args) {
        Carro fusca = new Carro();
        fusca.ano = 2012;
        fusca.cor = "Vermelho";
        System.out.println("Carro Fusca");
        System.out.println("Ano: " + fusca.ano);
        System.out.println("Cor: " + fusca.cor);
        fusca.ligar();
        fusca.desligar();
        fusca.acelerar();
    }
}
