import java.util.Locale;
import java.util.Scanner;

public class IexeForDivisaoUmPeloOutro {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		System.out.println("Enter the value of N: "); // entrada: valor de i (Loop)
		int vN = teclado.nextInt();

		for (int i = 0; i < vN; i++) { // Loop roda i vezes -(definido por N)

			System.out.println("Frist number: ");
			double primero = teclado.nextDouble();

			System.out.println("Second number: ");
			double segundo = teclado.nextDouble();

			if (segundo == 0) {										//regra:  denominador  = 0 ->impossível se não: primeiro/segundo
				System.out.println("Impossibled division!");
			} else {
				double resultado = primero / segundo;
				System.out.printf("Result: %.2f%n", resultado);
			}

		}

		System.out.println("End the program!");

		teclado.close();
	}
}
