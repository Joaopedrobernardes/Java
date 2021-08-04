import java.util.Scanner;

public class Leitura{
    public static void main(String args[]){
            Scanner teclado = new Scanner(System.in);

            int valorInteiro;
            double valorDouble;
            float valorFloat;

        System.out.println("Digite um valor inteiro:");
        valorInteiro = teclado.nextInt();
        System.out.println("Valor digitado = "+valorInteiro);

        System.out.println("Agora digite um valor double:");
        valorDouble = teclado.nextDouble();
        System.out.println("Valor digitado = "+valorDouble);

        System.out.println("Agora digita um valor float:");
        valorFloat = teclado.nextFloat();
        System.out.println("Valor digitado = "+valorFloat);



    }
}