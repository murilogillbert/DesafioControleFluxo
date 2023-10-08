import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int valor1 = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int valor2 = terminal.nextInt();

		try {
			// chamando o método contendo a lógica de contagem
			contar(valor1, valor2);

		} catch (ParametrosInvalidosException exception) {
			System.out.println(exception + "O segundo parâmetro deve ser maior que o primeiro");
		}

	}

	static void contar(int valor1, int valor2) throws ParametrosInvalidosException {
		// validar se valor1 é MAIOR que valor2 e lançar a exceção

		if (valor1 > valor2) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		for (int i = 1; i < valor2 - valor1; i++) {
			System.out.println("Imprimindo o número " + i);

			// realizar o for para imprimir os números com base na variável contagem
		}
	}
}