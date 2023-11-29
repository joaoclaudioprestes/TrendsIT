public class EstruturaWhile {
    public static void main(String[] args) {
        System.out.println("Exemplo 7 - Uso da estrutura 'while'");
		int contador = 1;
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		System.out.println("");
		System.out.println("Exemplo 8 - Uso da estrutura 'do while'");
		char novoJogo;
		do {
			System.out.println("Deseja jogar novamente(s/n)?");
			novoJogo = 'n';
		} while (novoJogo == 's');
		System.out.println("GAME OVER");
	}
}