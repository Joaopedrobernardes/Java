import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numfuncionario, horatrab;
        double salariohora, salariototal;
        
        // System.out.println("Qual o numero de identificacao do funcionaro? ");
        numfuncionario = teclado.nextInt();

        // System.out.println("Qual a quantidade de horas trabalhadas pelo funcionario? ");
        horatrab = teclado.nextInt();

        // System.out.println("Quanto o funcionario recebe por hora? ");
        salariohora = teclado.nextDouble();

        salariototal = horatrab*salariohora;
        // System.out.println("SALARY U$: "+salariototal);

        System.out.println("NUMBER = "+numfuncionario);
        System.out.printf("SALARY = U$ %.2f\n",salariototal);
    }
}
