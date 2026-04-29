package exerciciosjava2804.prompt02;
import java.util.Scanner;

public class MediaMercado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] preco = new double[10];
        double soma = 0, media = 0, valor = 0;
        int contMedia = 0;

        //receber os precos
        for(int i = 0; i < preco.length; i++){
            System.out.print("Digite o preço do produto " + (i + 1) + " :");
            preco[i] = sc.nextDouble();
            soma += preco[i];
        }
        //media e verificacao (acima da media ou nao)
        media = soma / (preco.length);
        for(int i = 0; i < preco.length; i++){
            if(preco[i] > media){
                contMedia++;
            }
        }
        System.out.println("O número de produtos com o valor acima da média é " + contMedia + ". Média: " + media);
        //valor de verificacao e indice
        System.out.println("Digite um valor e eu te mostrarei se há algum produto exatamente com o mesmo preço");
        valor = sc.nextDouble();
        for(int i = 0; i < preco.length; i++){
            if(preco[i] == valor){
                System.out.println("Produto com o índice " + i + " encontrado, com o mesmo valor que " + valor);
            }
        }
        sc.close();
    }
}
