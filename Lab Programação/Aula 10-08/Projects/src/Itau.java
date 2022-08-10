public class Itau {
    public static void main(String[] args) {
        int ITAU[] = {2,5,4,5,0,2,3,6,6};
        int i, resto, mult, soma, peso, conta, DVi, DVc, val;

        DVi = ITAU[ITAU.length-1];
        soma = 0;
        peso = 2;

        for(i = 0; i < ITAU.length-1; i++){
            mult = ITAU[i]*peso;
            if(mult > 9){
                mult = mult - 9;
            }
            soma = soma + mult;
            peso--;

            if(peso == 0){
                peso = 2;
            }
        }

        resto = soma % 10;
        if(resto == 0){
            DVc = 0;
        }

        else{
            DVc = 10 - resto;
        }

        if(DVi == DVc){
            System.out.println("Itaú Válido");
        }

        else{
            System.out.println("Itaú Válido");
        }

    }
}
