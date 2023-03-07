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
        
        if (Peso < 18.5){
            System.out.print("Abaixo do peso" );
        } else if (Peso < 18.5 && Peso >  24.9  ){
            System.out.print("Peso normal" );
        }else if (Peso < 25.0 && Peso >  29.9  ){
            System.out.print("Sobrepeso" );
        }  else if (Peso < 30.0 && Peso >  34.9){
            System.out.print("Obesidade grau 1" );
        }else if (Peso < 35.0 && Peso >  39.9){
            System.out.print("Obesidade grau 2" );
        }else if (Peso > 40.0 ){
            System.out.print("Obesidade grau 3 (mórbida)");
        }
        

        System.out.printf(" \n O seu peso é: " + Peso + "\n");    
        System.out.printf("Sua altura  é: " + Altura + "\n");
        System.out.printf(" \n  " + imc + "\n");
        


}
 }