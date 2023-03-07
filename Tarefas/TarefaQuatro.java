package Tarefas;
import java.util.Scanner;
public class TarefaQuatro {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        String nome1;
        int idade1;
        String nome2;
        int idade2;

        System.out.println("Informe seu nome: ");
        nome1 = input.next();
        System.out.println("Informe seu nome: ");
        nome2 = input.next();

        System.out.println("Informe sua idade: ");
        idade1 = input.nextInt();
        System.out.println("Informe sua idade: ");
        idade2 = input.nextInt();

        if (idade1 > idade2){
            System.out.print("Pessoa mais velha é a \n" + nome1 + "\n" );
            System.out.print("Sua idade é \n" + idade1 + "\n" );
        } else if (idade2 > idade1) {
            System.out.print("Pessoa mais velha é a \n" + nome2 + "\n" );
            System.out.print("Sua idade é  \n" + idade2+ "\n" );
        }


  }
    
}
