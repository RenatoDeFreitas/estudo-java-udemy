import java.util.Locale;
import java.util.Scanner;

public class Exe04CalculoHorasTrabalhadas {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		// declarações
		double matricula, numHoraTrabalhado, salarioHora, salario;

		// entrada
		System.out.print("N° funcionário (matrícula): ");
		matricula = entrada.nextDouble();

		System.out.print("Horas trabalhadas: ");
		numHoraTrabalhado = entrada.nextDouble();

		System.out.print("Valor do salário por hora: ");
		salarioHora = entrada.nextDouble();

		// cálculos

		salario = numHoraTrabalhado * salarioHora;

		// saida
		System.out.printf("O número do funcionário é %.2f e salário é U$ %.2f%n", matricula, salario);

		entrada.close();
	}
}
