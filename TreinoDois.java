import java.util.Scanner;

public class TreinoDois {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int nome, n1;

        
        System.out.println("Informe seu nome : ");
        nome = input.nextInt();

        System.out.println("Informe sua idade: ");
        n1 = input.nextInt();


        if ( n1 >= 0 && n1 <= 12 )
        {
            System.out.print(" Você ainda é criança. \n");
        } else if ( n1 >= 13 && n1 <= 17) {
            System.out.print(" Você ainda é adolecente. \n");
        } else if ( n1 >= 18 && n1 <= 59) {
            System.out.print(" Você ainda é adulto. \n");
        }else if ( n1 > 60) {
            System.out.print(" Você ainda é idoso. \n");
        } 
}
}