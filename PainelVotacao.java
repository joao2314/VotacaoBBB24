import java.util.Scanner;

public class PainelVotacao {

    static String Paredao = "";
    static int limit = 0;
    public static void main(String[] args) {
        System.out.println("Bem vindo ao painel de votação");
        Scanner scan = new Scanner(System.in);
        System.out.println("Coloque a senha: ");
        String senha = scan.next();
        if(!senha.equals("2248784")) {
            System.out.println("Erro na senha");
            return;
        }
        while(senha.equals("2248784")) {
            System.out.println("\nQuem voce deseja colocar na votaçao? (" + limit + "/" + "3)");
            Paredao += scan.next() + " ";
            limit += 1;  
               if(limit == 3) {
                System.out.println("Quem esta no paredao é: " + Paredao);
                Votacao.main(args);
                senha = "";
               }
            }
        }
    }
