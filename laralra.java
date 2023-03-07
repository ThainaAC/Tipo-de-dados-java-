import java.util.Scanner;

/**
* @author Samuel T. C. Santos
* @version 09.11.2014
* 
* Exemplo de execução (Use virgula e não ponto!):
* Metros? 2,36
* 236,0 cm
*
*/
public class laralra {
	
 public static void main(String args[]){

  Scanner entrada = new Scanner(System.in);

  System.out.print("Metros? ");
  float metros = entrada.nextFloat();

  float centimetros = metros * 100;

  System.out.printf("%.1f cm",centimetros);

 }
}
