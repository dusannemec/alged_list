import java.util.Scanner;

public class SerieExponencialNegativaD2 {
    public static double serie(int exp) {
        exp--;
        if (exp == 0) {
            return 1;
        }
        return (1/Math.pow(2, exp)) + serie(exp);
    }

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int exp = scan.nextInt();
        scan.close();

        System.out.printf("O %do da serie é: %.3f\n", exp, serie(exp));
    }
}