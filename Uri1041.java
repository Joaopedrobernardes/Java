import java.util.Scanner;
public class Uri1041{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        double x, y;

        System.out.println("Digite os quadrantes: ");
        x = teclado.nextDouble();
        y = teclado.nextDouble();

        if ((x == 0) && (y == 0)){
            System.out.printf("Origem");
        }
        else if ((x > 0) && (y > 0)){
            System.out.printf("Q1"); 
        }
                
        else if ((x > 0) && (y < 0)){
            System.out.printf("Q4");
        }
           
        else if ((x < 0) && (y > 0)){
            System.out.printf("Q2");
        }
        
        else if ((x < 0) && (y < 0)){
            System.out.printf("Q3");
        }
        else if (x != 0 && y ==0){
            System.out.println("Eixo X");
        }
        else if (x == 0 && y != 0){
            System.out.println("Eixo Y");
        }
      
        
    }
}