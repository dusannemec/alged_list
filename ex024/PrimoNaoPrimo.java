import java.util.Scanner;

public class PrimoNaoPrimo {
    public static boolean primo(int num, int divisor) {
        if (num == 1) {
            return false;
        }
        else if (num/2 < divisor) {
            return true;
        }
        else if (num % divisor == 0) {
            return false;
        }
        else {
            return primo(num, divisor+1);
        }
    }

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int num = scan.nextInt();

        System.out.println(primo(num, 2) ? "É primo" : "Não é primo");

        scan.close();
    }
}