import java.util.Arrays;
import java.util.Scanner;

public class BuscaLinearString2 {

    public static int buscaLinear(char[] vetor, char k) {
        int i;
        for (i = 0; i < vetor.length; i++) {
            if(vetor[i] == k) {
                return i;
            }
        }
        return i;
    }

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        String str;

        do {
            System.out.println("Digite algo contendo exatos 15 caracteres: ");
            str = scan.next();
            if (str.length() > 15) {
                System.out.println("A string deve conter exatos 15 caracteres!");
            }
        } while (str.length() > 15);

        char[] vetor =  new char[str.length()];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = str.charAt(i);
        }

        System.out.println(Arrays.toString(vetor));

        System.out.print("Digite um caracter da string para verificar sua posição: ");
        char k = scan.next().charAt(0);

        scan.close();

        int posicao = buscaLinear(vetor, k);

        String resultado = posicao < vetor.length ? String.format("Caracter \"%c\" encontrado na posição: %d", k, posicao) : String.format("Posição: %d. Caracter não encontrado!", posicao);

        System.out.println(resultado);
        
    }
}