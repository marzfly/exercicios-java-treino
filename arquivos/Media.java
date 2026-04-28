package exerciciosjava2804;
import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua nota");
        double nota = sc.nextDouble();
        if(nota >= 7){
            System.out.println("Aprovado");
        } else if (nota <= 6.9 && nota > 5){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        sc.close();
    }
}
