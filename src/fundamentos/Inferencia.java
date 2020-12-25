package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double a = 4.5;
		var a = 4.5; // Nesse caso, o Java vai inferir o tipo da variável
		var c = "Texto";
		System.out.println(a + c);
		c = "Outro texto";
		System.out.println(c);		
	}

}
