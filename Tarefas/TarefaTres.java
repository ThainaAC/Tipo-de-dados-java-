package Tarefas;
import java.util.Scanner;

public class TarefaTres {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        float m, c;
        
        System.out.println("Digite um numero: ");
        m = input.nextFloat();

        c = m * 100;

        System.out.print("convertido em cm é " + c + "\n" );
      
    }
}
