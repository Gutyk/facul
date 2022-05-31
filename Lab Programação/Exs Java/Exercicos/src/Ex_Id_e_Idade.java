import java.util.Scanner;

public class Ex_Id_e_Idade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id = 0, idmax = 0, idmin = 0, idade = 0, idademin = 100, idademax = 0;

        for(int i = 0; i < 5; i++) {
                do {
                    System.out.println("Digite seu ID: ");
                    id = input.nextInt();
                } while (id < 11 || id > 99);
                System.out.println("Digite sua idade: ");
                idade = input.nextInt();
                if(i == 0){
                    idademax = idade;
                    idmax = id;
                    idademin = idade;
                    idmin = id;
                }
                else{
                        if(idade > idademax){
                            idademax = idade;
                            idmax = id;
                        }
                        if(idade < idademin){
                            idademin = idade;
                            idmin = id;
                        }
                }
        }
        System.out.println("Mais velho tem " + idademax + " ID: " + idmax);
        System.out.println("Mais novo tem " + idademin + " ID: " + idmin);
    }
}
