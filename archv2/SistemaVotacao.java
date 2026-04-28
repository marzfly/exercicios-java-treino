package exerciciosjava2804.prompt02;
import java.util.Scanner;
public class SistemaVotacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de Votação");
        System.out.println("==================");
        System.out.println("Digite 0 para encerrar.");
        System.out.println("==================");

        int voto = 0;
        double votosTotal = 0, contVoto1 = 0, contVoto2 = 0, contVoto3 = 0, contVotoNulo = 0;
        double porc1, porc2, porc3, porcNul;

        do{
            System.out.println("Digite um número para votar");
            voto = sc.nextInt();
            if(voto == 1){
                votosTotal++;
                contVoto1++;
            } else if(voto == 2){
                votosTotal++;
                contVoto2++;
            } else if(voto == 3){
                votosTotal++;
                contVoto3++;
            } else {
                votosTotal++;
                contVotoNulo++;
            }
        }while(voto != 0);

        porc1 = (contVoto1 / votosTotal) * 100;
        porc2 = (contVoto2 / votosTotal) * 100;
        porc3 = (contVoto3 / votosTotal) * 100;
        porcNul = (contVotoNulo / votosTotal) * 100;

        System.out.println("PORCENTAGEM DE VOTOS - TOTAL: " + votosTotal);
        System.out.print("1 - Cebolhonha: " + contVoto1 + " | ");
        System.out.printf("%.2f", porc1);
        System.out.print("% \n");

        System.out.print("2 - Monicarlos: " + contVoto2 + " | ");
        System.out.printf("%.2f", porc2);
        System.out.print("% \n");

        System.out.print("3 - Cebonina: " + contVoto3 + " | ");
        System.out.printf("%.2f", porc3);
        System.out.print("% \n");

        System.out.print("0 - NULOS: " + contVotoNulo + " | ");
        System.out.printf("%.2f", porcNul);
        System.out.print("% \n");

        sc.close();
    }
}
