package fundamentos.desafios;

import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
        System.out.print("Digite a temperatura em fahrenheit: ");
        double temp = t.nextDouble();
        
        double celsius;
        celsius = (temp-32)*5/9;
        
        System.out.println("A temperatura em Celsius é: " + celsius);

	}

}
