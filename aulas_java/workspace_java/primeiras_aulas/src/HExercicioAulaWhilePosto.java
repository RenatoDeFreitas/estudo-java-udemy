import java.util.Scanner;

public class HExercicioAulaWhilePosto {
	public static void main(String[] args) {

//SET
		Scanner teclado = new Scanner(System.in);

//INPUT
		System.out.println("Digite o produto: ");
		int codigoProduto = teclado.nextInt();

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

//LOGICA

		while (codigoProduto != 4) {		//4 condição para sair do WHILE
			switch (codigoProduto) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			case 4:
				break;
			default:
				System.out.print("Código inválido, digite outro número: ");
				System.out.println();
			}
			System.out.print("digite novo código: ");
			codigoProduto = teclado.nextInt();

		}
		teclado.close();

		System.out.println("Fim, MUito obrigado!");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
	}

}
