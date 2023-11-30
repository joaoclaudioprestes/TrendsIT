public class Cessna {
    public static void main(String[] args) {
        Aviao cessna = new Aviao();
        cessna.ano = 2019;
        cessna.cor = "Rosa";
        cessna.envergadura = 4.5;
        System.out.println("Carro Cessna");
        System.out.println("Ano: " + cessna.ano);
        System.out.println("Cor: " + cessna.cor);
        System.out.println("Envergadura: " + cessna.envergadura);
        cessna.ligar();
        cessna.acelerar();
        cessna.aterrizar();
        cessna.desligar();
    }
}
