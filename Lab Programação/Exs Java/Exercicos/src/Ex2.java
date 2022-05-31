import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i;
        double fat;

        System.out.println("Digite o valor para fazer o fatorial: ");
        n = input.nextInt();
        fat = 1;
        i = 1;

        while(i <= n){
            fat = fat * i;
            i++;
        }

        System.out.println("Fatorial de " + n + "!= " + fat);
    }
}
