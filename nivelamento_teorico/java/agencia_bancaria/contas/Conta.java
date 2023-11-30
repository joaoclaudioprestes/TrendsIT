package nivelamento_teorico.java.agencia_bancaria.contas;

public class Conta {
    // atribbutos
    String cliente;
    double saldo;

    // constructor
    public Conta() {
        System.out.println("Agência 0261");
    }

    // metodos
    void exibirSaldo() {
        System.out.println("Saldo: " + saldo);
        
    }
}
