import java.util.Scanner;

public class IAulaFor {

	public static void main(String[] args) {

//CONFIGURACAO
		Scanner teclado = new Scanner(System.in);
		
//ENTRADA
		System.out.println("Número de repetições: ");
		int num = teclado.nextInt();					//captura inf.teclado
		
		int soma = 0;
		for( int i = 0; i < num; i++) {						//condicional  for
			System.out.print("Digite um número: ");			//capturar um valor para soma
			int numDigitado = teclado.nextInt();					//captura inf.teclado
			soma = soma + numDigitado;						//valor(num)digitado + próximos a ser digitado
			
		}
		System.out.println("Valor da soma: "+ soma);
		teclado.close();
	}
}
