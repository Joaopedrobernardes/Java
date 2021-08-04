import java.util.Scanner;

public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int Y;
        double  X, Z;

        System.out.println("Distancia Total percorrida em KM? ");
        Y = teclado.nextInt();
        
        System.out.println("Total de combustivel gasto em Litros? ");
        X = teclado.nextDouble();

        Z = Y/X;

        System.out.printf("COSUMO MEDIO = %.3f km/l\n", Z);

    }
}