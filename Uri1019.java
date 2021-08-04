import java.util.Scanner;
public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int tempo, segundos, horas, minutos;

        //System.out.println("Tempo: ");
        tempo = teclado.nextInt();
        
        segundos = tempo %60;
        minutos = tempo/60 %60;
        horas = tempo/3600 %60;
        
        System.out.printf(horas + ":" + minutos + ":" +segundos);


    }
}