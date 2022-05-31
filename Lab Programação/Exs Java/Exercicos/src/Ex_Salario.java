import java.util.Scanner;

public class Ex_Salario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sal, salmin, salmax, salmedia, salsoma;
        int id, idmax, idmin;
        salmin = 3636;
        salmax = 1212;
        id = 0;
        idmin = 0;
        idmax = 0;
        salmedia = 0;
        salsoma = 0;

        for(int i = 1; i < 6; i++){
            System.out.println(i);
            do{
            System.out.println("Digite seu ID: ");
            id = input.nextInt();
            }while(id < 11 || id > 99);
            do{
                System.out.println("Digite seu salario: ");
                sal = input.nextDouble();
            }while(sal < 1212 || sal > 3636);
            System.out.println("-------------------------------------");

            salsoma = salsoma + sal;
            salmedia = salsoma/5;

            if(i == 0){
                salmax = sal;
                idmax = id;
                salmin = sal;
                idmin = id;
            }
            else{

                if(sal > salmax){
                    salmax = sal;
                    idmax = id;
                }

                if(sal < salmin){
                    salmin = sal;
                    idmin = id;
                }
            }
        }
        System.out.println("O maior salario: " + salmax +" do ID: " + idmax);
        System.out.println("O menor salario: " + salmin +" do ID: " + idmin);
        System.out.println("A media salarial " + salmedia);
    }
}
