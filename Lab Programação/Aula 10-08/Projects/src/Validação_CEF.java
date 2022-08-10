public class Validação_CEF {
    public static void main(String[] args) {
        int CEF[] = {2,0,0,4,0,0,1,0,0,0,0,0,4,4,8};
        int i,soma, peso, DVi, DVc;


        DVi = CEF[CEF.length-1];
        soma = 0;
        peso = 8;

        for(i = 0; i < 15; i++){
            soma = soma + CEF[i] * peso;
            peso--;
            if(peso == 1) {
                peso = 9;
            }
        }

        soma = 10*soma;

        DVc = soma % 11;
        if(DVc == 10){
            DVc = 0;
        }

        if(DVi == DVc){
            System.out.println("CEF Válida");
        }
        else{
            System.out.println("CEF Inválida");
        }

    }
}
