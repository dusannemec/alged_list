import java.util.Scanner;

public class MetodoParImpar {
    public static boolean verificaParImpar(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número para verificar se é par ou impar: ");
        int num = scan.nextInt();

        String resultado = verificaParImpar(num) ? "Par" : "Impar";

        System.out.println(resultado);
    }
}