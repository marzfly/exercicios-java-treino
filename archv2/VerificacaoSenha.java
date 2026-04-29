package exerciciosjava2804.prompt02;
import java.util.Scanner;
public class VerificacaoSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = 1441;
        int senhaDigitada = 0;
        boolean senhaVF = false;
        int tentativas = 0;

        System.out.println("=================");
        System.out.println("BANCO DA INBONHA");
        System.out.println("=================");

        System.out.println("\n");

        do{
            System.out.println("Digite a senha: ");
            senhaDigitada = sc.nextInt();
            if(senhaDigitada != senha){
                tentativas++;
                System.out.println("Senha incorreta!");
                if(senhaDigitada > senha && tentativas < 3){
                    System.out.println("Dica: a senha é menor");
                } else if(senhaDigitada < senha && tentativas < 3){
                    System.out.println("Dica: a senha é maior");
                }
            } else {
                senhaVF = true;
                System.out.println("Senha correta! Acesso liberado.");
                break;
            }
        }while(!senhaVF && tentativas < 3);

        if(tentativas >= 3){
            System.out.println("Acesso bloqueado.");
        }

        sc.close();
    }
}
