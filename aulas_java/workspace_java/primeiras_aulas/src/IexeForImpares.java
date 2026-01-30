import java.util.Scanner;

public class IexeForImpares {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Value X: ");
		int X = teclado.nextInt(); // ENTRADA
		
		int soma = 0;

		if (X >= 1 && X <= 1000 ) { 				//validar ENTRADA - entre 1 a 1000
			
			for (int i = 1; i <= X; i++ ) {			//condição de valores de 1 até X - i cresce em direção a X
				if(i %2 != 0){						// valores impares  - imprime
					
					System.out.println(i);
				soma +=i;
				}
				
			}
		}
		else {
			System.out.println("Intervalo fora da faixa: 1 e 1000. Comece novamente!");
		}
		
		teclado.close();
		System.out.println("total: "+soma);
		System.out.println("Fim programa");

	}

}
