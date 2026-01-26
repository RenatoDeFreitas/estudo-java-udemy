import java.util.Scanner;

public class HExercicioAulaWhile {
	public static void main(String[] args) {
//CONFIGURACAO
		Scanner sc = new Scanner(System.in);
	
//ENTRADAS
		System.out.println("Value X: ");
		int X = sc.nextInt();
		
		System.out.println("Value Y: ");
		int Y = sc.nextInt();
//LOGICA		
		while ( X < 3 ) {
			Y += 2;
			X += 1;
		System.out.println("New X: "+ X +" - New Y: "+ Y );
			
		}
			
			
		sc.close();
	}

}
