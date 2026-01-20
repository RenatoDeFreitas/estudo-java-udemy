import java.util.Scanner;

public class Fcondicional01NegativoPositivo {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um número inteiro! ");
		int numero = teclado.nextInt();

		if (numero < 0) {
			System.out.print("NEGATIVO");
		} else {
			System.out.print("NÃO NEGATIVO");
		}

		teclado.close();
	}
}
