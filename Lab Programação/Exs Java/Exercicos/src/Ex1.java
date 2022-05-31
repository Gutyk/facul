import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int i, n;

        for(i = 1; i <= 10; i++){
            for(n = 1; n <= 10; n++){
                System.out.println(i + " x " + n + " = " + i*n);
            }
            System.out.println("--------------");
        }
    }
}
