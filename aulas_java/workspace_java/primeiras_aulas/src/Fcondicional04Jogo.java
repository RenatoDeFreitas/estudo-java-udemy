import java.util.Scanner;

public class Fcondicional04Jogo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// capturando + declarando vaiáveis

		System.out.println("Enter the game start time: ");
		int startTime = sc.nextInt();

		System.out.println("Enter the game end time: ");
		int endTime = sc.nextInt();

		int duration;
		// condicional

		if (startTime < endTime) {
			duration = endTime - startTime;
		}
		else {
			duration = (24 - startTime) + endTime;
		}

		System.out.printf("The game lested %d  hours!", duration);
		
		sc.close();
	}
}
