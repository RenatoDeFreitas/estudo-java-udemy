import java.util.Scanner;

public class Exe01SomaSimples {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite valor 01: ");
		int valor1 = teclado.nextInt();

		System.out.print("Digite o valor 02: ");
		int valor2 = teclado.nextInt();

		int SOMA = valor1 + valor2;
		
		System.out.println();
		System.out.printf("A SOMA entre %d e %d é %d%n", valor1, valor2, SOMA);
		System.out.println();
		System.out.printf("SOMA = %d\n",SOMA);

		teclado.close();

	}

}
