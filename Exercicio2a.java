import java.util.Scanner;

public class Exercicio2a{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
       
    
        double ladoA, ladoB, Area;
  
        System.out.println("Digite o valor de um lado do Quadrado: ");
        ladoA = teclado.nextDouble();

        System.out.println("Digita o valor do outro lado do Quadrado: ");
        ladoB = teclado.nextDouble();

        Area = ladoA * ladoB;
        System.out.println("O valor da Area do Quadrado eh: %.2f", Area);


    }


}