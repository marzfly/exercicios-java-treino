package exerciciosjava2804;
import java.util.Scanner;
public class Vetores01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];
        int maiorValor = 0;
        int somaValores = 0;
        maiorValor = vetor[0];
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um número");
            vetor[i] = sc.nextInt();
            somaValores += vetor[i];
            if(vetor[i] > maiorValor){
                maiorValor = vetor[i];
            }
        }
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Soma dos valores: " + somaValores);
        sc.close();
    }
}
