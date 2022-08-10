public class Validação_CPF {
    public static void main(String[] args){
     int CPF[] = {1,2,3,4,5,7,7,8,9,5,4};
     int i, soma, peso, resto, DV1i, DV2i, DV1c, DV2c;

     DV1i = CPF[CPF.length-2];
     DV2i = CPF[CPF.length-1];

     soma = 0;
     peso = 10;

     for(i = 0; i < 9; i++){
         soma = soma + peso * CPF[i];
         peso--;
     }

     resto = soma % 11;

     if(resto < 2){
         DV1c = 0;
     }
     else {
        DV1c = 11 - resto;
     }

        soma = 0;
        peso = 11;

        for(i = 0; i < 10; i++){
            soma = soma + peso * CPF[i];
            peso--;
        }

        resto = soma % 11;

        if(resto < 2){
            DV2c = 0;
        }
        else {
            DV2c = 11 - resto;
        }

     System.out.println("DV1c= " + DV1i);

     if((DV1c == DV1i) && (DV2c == DV2i)){
        System.out.println("CPF Válido");
     }
     else {
        System.out.println("CPF Inválido");
     }

    }
}
