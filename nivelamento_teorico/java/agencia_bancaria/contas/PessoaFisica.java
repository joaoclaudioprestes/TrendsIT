package nivelamento_teorico.java.agencia_bancaria.contas;

public class PessoaFisica {
    public static void main(String[] args) {
        Conta cc1 = new Conta();
        cc1.cliente = "João Prestes";
        cc1.saldo = 101923821;
        System.out.println("Cliente: " + cc1.cliente);
        cc1.exibirSaldo();
        System.out.println("------------------------------------------------");
        Conta cc2 = new Conta();
        cc2.cliente = "João Claudio Prestes";
        cc2.saldo = 1421;
        System.out.println("Cliente: " + cc2.cliente);
        cc1.exibirSaldo();
    }
}
