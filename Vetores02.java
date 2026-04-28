package exerciciosjava2804;
import java.util.Scanner;
public class Vetores02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vetor = new String[6];
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite um nome: ");
            vetor[i] = sc.nextLine();
        }
        System.out.println("==========");
        for(int i = vetor.length - 1; i >= 0; i--){
            System.out.println(vetor[i]);
        }
        sc.close();
    }
}
