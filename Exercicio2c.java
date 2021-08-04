import java.util.Scanner;

public class Exercicio2c{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        
        double base, altura, Area;

        System.out.println("Digite o valor da Base:");
        base = teclado.nextDouble();

        System.out.println("Digite o valor da Altura: ");
        altura = teclado.nextDouble();

        Area = (base*altura)/2;
        System.out.printf("O valor da Area eh = %.3f\n",Area);








    }
}
