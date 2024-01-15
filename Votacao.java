import java.util.Scanner;

public class Votacao {

    static int[] votos = {0,0,0};
    public static void main(String[] args) {
       System.out.println("Bem vindo a votação");
        Scanner scan = new Scanner(System.in);
        
        String[] vector = PainelVotacao.Paredao.split(" ");

       
        System.out.println("Quem voce quer que fique no BBB24?");

        while(!vector[0].equals("$571f")) {
        System.out.println("\n 1 - " + vector[0] + "\n 2 - " + vector[1] + "\n 3 - " + vector[2] + "\n");
        System.out.print("Reposta: ");
        int votosMem = scan.nextInt() - 1;
        votos[votosMem] += 1;
        System.out.println("\nVoto confirmado: " + vector[votosMem]);
        System.out.println("Deseja repetir seu voto em mais alguem? (s/n)");
        char escolha = scan.next().charAt(0);
        if(escolha == 'n') { vencedor(); vector[0] = "$571f"; }
        }
    }

    private static void vencedor() {
        String[] vector = PainelVotacao.Paredao.split(" ");
        System.out.println("");
        if(votos[0] > votos[1] && votos[0] > votos[2]) {
            System.out.println("Oque ficou no BBB é: " + vector[0] + " com seus: " + votos[0] + " votos");
            System.out.println("\nOs perdedores: \n"
             + vector[1] + ": " + votos[1] + " votos" + 
             "\n" + vector[2] + ": " + votos[2] + " votos"
             );
        } else if(votos[1] > votos[0] && votos[1] > votos[2]) {
            System.out.println("Oque ficou no BBB é: " + vector[1] + " com seus: " + votos[1] + " votos");
            System.out.println("\nOs perdedores: \n"
             + vector[0] + ": " + votos[0] + " votos" + 
             "\n" + vector[2] + ": " + votos[2] + " votos"
             );
        } else {
            System.out.println("Oque ficou no BBB é: " + vector[2] + " com seus: " + votos[2] + " votos");
            System.out.println("\nOs perdedores: \n"
             + vector[1] + ": " + votos[1] + " votos" + 
             "\n" + vector[0] + ": " + votos[0] + " votos"
             );
        }
        System.out.println("");
    }
}