
public class atribuicaoVariaveis {
	public static void main(String[] args) {

		int x;
		double y;
		double Resultado, semCasting;

		x = 7;
		y = 0.235 * x;
		semCasting = x/y;
		Resultado = (int) (x / y); // casting

		System.out.println(x);
		System.out.printf("Multiplicação entre %d e 2 é: %.1f%n", x, y);
		System.out.printf("Usando o casting para transformar o double %.2f  em " + "valor inteiro como: %.0f", 
				semCasting,Resultado);

	}

}
