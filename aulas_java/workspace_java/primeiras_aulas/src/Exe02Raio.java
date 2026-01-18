import java.util.Locale;
import java.util.Scanner;

public class Exe02Raio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digito o valor do raio do circulo: ");
		double raio = sc.nextDouble();
		double area = 3.14159 * raio;

		System.out.println();
		System.out.printf("Circulo com raio de %.2f têm área de %.4f%n", raio, area);
		

		sc.close();
	}

}
