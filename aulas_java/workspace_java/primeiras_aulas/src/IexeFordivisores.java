import java.util.Scanner;

public class IexeFordivisores {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in); // ler N inteiro
		System.out.print("Value N: ");
		int vN = teclado.nextInt();

		for (int i = 1; i <= vN; i++) {			//validar divisores de um número inteiro
			if (vN % i == 0) {
				System.out.println(i);
			}
		}

		teclado.close();
	}
}
