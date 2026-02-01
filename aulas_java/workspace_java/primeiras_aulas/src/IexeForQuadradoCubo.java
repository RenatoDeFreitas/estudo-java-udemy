import java.util.Scanner;

public class IexeForQuadradoCubo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // conf.entrada
		System.out.println("Número inteiro: ");
		int numero = sc.nextInt();
		double quadrado = 0;
		double cubo = 0;

		if (numero < 0) {
			System.out.println("Valor inválido!");
		} else {
			for (int i = 1; i <= numero; i++) { 		// valor da linha = i

				quadrado = Math.pow(i, 2); 			// quadrado = i expoente 2
				cubo = Math.pow(i, 3); 				// cubo = i expoente 3

				System.out.printf("%d  %.0f  %.0f%n", i, quadrado, cubo);

			}

		}

		sc.close();
	}

}
