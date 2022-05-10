import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {	
		
		int a, b, c, soma;
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.print("Informe o valor de a: ");
		a = teclado.nextInt();
		System.out.print("Informe o valor de b: ");
		b = teclado.nextInt();
		System.out.print("Informe o valor de c: ");
		c = teclado.nextInt();
		
		soma = a + b + c;
		System.out.println("O valor total é: " + soma);
		
		teclado.close();
		
		if (soma == 69) {
			System.out.print("XD");
		}
		
		else {
			System.out.println("No XD :(");
		}	
	}
}
