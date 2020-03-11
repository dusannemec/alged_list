import java.util.Scanner;

public class BuscaLinearInt {

    public static int buscaLinearInt(int[] vetor, int k) {
        int i;
        for (i = 0; i < vetor.length; i++) {
            if (vetor[i] == k) {
                return i;
            }
        }
        return i;
    }

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] vetor = new int[15];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %do número: ", (i+1));
            vetor[i] = scan.nextInt();
        }

        System.out.printf("Digite um número para procurar a posição dele no vetor: ");
        int k = scan.nextInt();

        scan.close();

        System.out.println(buscaLinearInt(vetor, k) < vetor.length ? String.format("Número %d encontrado na posição %d", k, buscaLinearInt(vetor, k)) : String.format("Posição: %d. Número não encontrado!", buscaLinearInt(vetor, k)));
    }
}