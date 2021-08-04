import java.util.Scanner;
public class Uri1066{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        int valores, numero, qtdPositivos, qtdPares, qtdImpares, qtdNegativos;

        qtdImpares = 0;
        qtdPares = 0;
        qtdNegativos = 0;
        qtdPositivos = 0;


        for (int cont = 1; cont <= 5; cont++){
            numero = teclado.nextInt();
            if (numero %2 == 0){
                qtdPares = qtdPares + 1;
            }

            else if (numero %2 != 0){
                qtdImpares = qtdImpares + 1;
            }

            if (numero > 0){
                qtdPositivos = qtdPositivos + 1;
                
            }
            
            else if (numero < 0){
                qtdNegativos = qtdNegativos + 1;
               
            }
              
            
            
        }

        System.out.println(qtdPares+ " valor(es) par(es)");
        System.out.println(qtdImpares+ " valor(es) impar(es)");
        System.out.println(qtdPositivos+ " valor(es) positivo(s)");
        System.out.println(qtdNegativos+ " valor(es) negativo(s)");
        

    }
}