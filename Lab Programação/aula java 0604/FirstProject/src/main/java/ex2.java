import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		float a, b, media; 
		
		Scanner i;
		i = new Scanner(System.in);
		
		System.out.print("Informe o valor da primeira nota (de 0 a 10): ");
		a = i.nextFloat();
		
		if (a > 10) {
			System.out.println("Nota invalida.");
		}
		else {
			
			System.out.print("Informe o valor da segunda nota (de 0 a 10): ");
			b = i.nextFloat();
			
			if (b > 10) {
				System.out.println("Nota invalida.");
			}
				else {
						
				i.close();		
				media = (a + b)/2;
				
				System.out.print("A média é de: "+media);
				System.out.println();
				if (media >= 6) {
					System.out.println("Nota suficiente.");
				}
				else {
					System.out.println("Nota insuficiente.");
				}
			}
		}
	}

}
