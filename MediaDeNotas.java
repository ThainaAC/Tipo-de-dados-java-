import java.util.Scanner;
public class MediaDeNotas {
    
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int n1, n2, media;

    System.out.println("Informe o valor da primeira nota: ");
    n1 = input.nextInt();
    
    System.out.println("Informe o valor da segunda nota: ");
    n2 = input.nextInt();

    media = (n1 + n2) /2 ;
    
    System.out.printf("Sua primeiro nota foi = " + n1);
    System.out.printf(" \n Sua segundo nota foi foi  = " + n2);
    System.out.printf(" \n E sua media é = " + media + "\n");   
    
    if (media >= 8 && media <= 10 )
    {
        System.out.print("Aluno está aprovado \n");
    } else if (media >= 5 && media <= 7){
        System.out.print("Aprovado, mas tera que fazer recuperação \n");
    } else if (media >= 0 && media <= 4) {
        System.out.print("Aluno está reprovado \n");
    } else {
        System.out.print("erro na media \n");
    }
}
}