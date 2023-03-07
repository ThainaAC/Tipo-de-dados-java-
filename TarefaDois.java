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
        
        if (imc < 18.5){
            System.out.print("Abaixo do peso" );
        } else if (imc < 18.5 && imc >  24.9  ){
            System.out.print("Peso normal" );
        }else if (imc < 25.0 && imc >  29.9  ){
            System.out.print("Sobrepeso" );
        }  else if (imc < 30.0 && imc >  34.9){
            System.out.print("Obesidade grau 1" );
        }else if (imc < 35.0 && imc >  39.9){
            System.out.print("Obesidade grau 2" );
        }else if (imc > 40.0 ){
            System.out.print("Obesidade grau 3 (mórbida)");
        }
        
        System.out.printf(" \n O seu peso é: " + Peso + "\n");    
        System.out.printf("Sua altura  é: " + Altura + "\n");
        System.out.printf(" \n  " + imc + "\n");

    }
 }