package fundamentos.desafios;

public class ConversorTemperaturaResposta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double fator = 5.0/9.0;
		final double ajuste = 32;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - ajuste)*fator;
		
		System.out.println("O resultado é " + celsius + "C");

	}

}
