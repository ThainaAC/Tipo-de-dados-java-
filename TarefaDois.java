import java.util.Scanner;

public class TarefaDois
 {
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        double Peso, Altura, imc;


        System.out.println("Informe seu peso: ");
        Peso = input.nextDouble();

        System.out.println("Informe sua altura: ");
        Altura = input.nextDouble();
        
        
        
        imc = Peso / (Altura * Altura);

        System.out.printf(" \n O seu peso é: = " + Peso "\n");    
        System.out.printf("Seu primeiro numero foi = " + Altura "\n");
        System.out.printf(" \n Seu segundo numero foi  = " + imc  "\n");
        

}
 }