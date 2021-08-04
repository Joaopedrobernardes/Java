import java.util.Scanner;
public class Exercicio5{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double mediacarro, distancia, velocidade, tempo, qtdcombustivel;
         
         System.out.println("Digite qual eh a media km/l do carro: ");
         mediacarro = teclado.nextDouble();

         System.out.println("Digita qual eh a distancia que o carro percorreu: ");
         distancia = teclado.nextDouble();

         System.out.println("Quanto tempo foi gasto na viagem: ");
         tempo = teclado.nextDouble();

         velocidade = distancia/tempo;
         System.out.println("A velocidade media gasta pelo carro foi de:\n "+velocidade);

         qtdcombustivel = distancia/mediacarro;
         System.out.println("A quantidade de combustivel gasta pelo carro foi de:\n "+qtdcombustivel);


    }



}