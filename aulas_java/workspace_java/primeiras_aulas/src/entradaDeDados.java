import java.util.Scanner;



public class entradaDeDados {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String nome;
		int idade;
		double altura;

		System.out.println("Digite seu nome:");
		nome = teclado.nextLine();

		System.out.println("Digite sua idade:");
		idade = teclado.nextInt();

		System.out.println("Digite sua altura:");
		altura = teclado.nextDouble();

		System.out.printf("Seu nome é %s sua idade é %d e você tem %.2f", nome, idade, altura);

		teclado.close();

	}
}
