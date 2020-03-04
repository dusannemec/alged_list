import java.util.Scanner;

public class Ex030Step2Step {
    public static double serie(int exp) {
        System.out.println(exp--);
        if (exp == 0) {
            System.out.println("Ultima execução... retornando 1...");
            return 1;
        }
        System.out.printf("%.3f\n", (1/Math.pow(2, exp)));
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