import java.util.Scanner;
import java.lang.Math;


public class ex3 {

	public static void main(String[] args) {
		
		Scanner i;
		i = new Scanner(System.in);
		double r, area;
		
		System.out.println("Digite o valor do raio: ");
		r = i.nextDouble();
		
		area = Math.PI * Math.pow(r, 2);
		
		System.out.println("O valor da área é: " +(String.format("%.2f", area)));
		
		i.close();
}
}
