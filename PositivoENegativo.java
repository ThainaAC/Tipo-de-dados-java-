import java.util.Scanner;

public class PositivoENegativo {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int n1;
        System.out.println("Informe um valor: ");
        n1 = input.nextInt();
        
        if ( n1 > 0)
        {
            System.out.print(" Seu nuemro é positivo \n");
        } else if ( n1 < 0){
            System.out.print("seu nuemro é negativo \n");
        }
}
}
