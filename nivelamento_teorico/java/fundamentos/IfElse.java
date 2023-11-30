public class IfElse {
    public static void main(String[] args) {
        char sexo = 'M';
        int idade = 18;

        System.out.println("Exemplo 1 - Uso do 'if'");
		if (sexo == 'M') {
			System.out.println("Alistamento militar obrigatório");
		}
		System.out.println("");
		System.out.println("Exemplo 2 - Uso do 'if else'");
		if (idade < 18) {
			System.out.println("Menor de idade");
		} else {
			System.out.println("Maior de idade");
		}
		System.out.println("");
		System.out.println("Exemplo 3 - Uso do 'else if'");
		if (idade < 16) {
			System.out.println("PROIBIDO VOTAR");
		} else if (idade >= 18 && idade <= 70) {
			System.out.println("VOTO OBRIGATÓRIO");
		} else {
			System.out.println("VOTO FACULTATIVO");
		}
		System.out.println("");

		System.out.println("Exemplo 2 - Uso do 'if else'");
		if (idade < 18) {
			System.out.println("Menor de idade");
		} else {
			System.out.println("Maior de idade");
		}
		System.out.println("");
		System.out.println("Exemplo 3 - Uso do 'else if'");
		if (idade < 16) {
			System.out.println("PROIBIDO VOTAR");
		} else if (idade >= 18 && idade <= 70) {
			System.out.println("VOTO OBRIGATÓRIO");
		} else {
			System.out.println("VOTO FACULTATIVO");
		}
    }
}
