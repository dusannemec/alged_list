import java.util.Arrays;
import java.util.Scanner;

public class Teatro3000 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        
        int[][] lugares = new int[100][30];
        int[] localizacao = new int[30];
        
        for (int i = 0; i < localizacao.length; i++) {
            localizacao[i] = i+1;
        }

        int entrada;
        do {
            System.out.println("X " + Arrays.toString(localizacao));
            for (int i = 0; i < lugares.length; i++) {
                System.out.println(i+1 + " " + Arrays.toString(lugares[i]));
            }

            System.out.println("0. Livre\n1.Reservado\n2.Vendido\n-1.Sair");
            entrada = scan.nextInt();

            if (entrada == 0 || entrada == 1 || entrada == 2) {
                int linha, coluna;
                System.out.println("\n\nInsira o número da fileira:");
                linha = scan.nextInt();

                System.out.println("\n\nInsira o número da cadeira:");
                coluna = scan.nextInt();

                lugares[linha-1][coluna-1] = entrada;
            }
        } while (entrada != -1);

        scan.close();
    }
}