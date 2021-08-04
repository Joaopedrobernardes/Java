import java.util.Scanner;

public class Exercicio3{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        
        double salarioMin, qtdKW, cadaKW, valorpago, valorpagodesconto;

        System.out.println("Informe o salario minimo altual: ");
        salarioMin = teclado.nextDouble();

        System.out.println("Informe a quantidade de KW gasta: ");
        qtdKW = teclado.nextDouble();

        cadaKW = (salarioMin/700);
        System.out.println("O valor de cada KW de acordo com o salario minimo sera = "+cadaKW);

        valorpago = cadaKW*qtdKW;
        System.out.println("O valor a ser pago de acordo com o consumo sera = "+valorpago);

        valorpagodesconto = valorpago-(cadaKW*qtdKW)*0.10;
        System.out.println("O valor a ser pago com desconto sera = "+valorpagodesconto);






    }


}