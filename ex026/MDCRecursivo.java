import java.util.Scanner;

public class MDCRecursivo {
    public static int mdc(int num1, int num2, int divisor) {
        if (num2 % divisor == 0 && num1 % divisor == 0) {
            return divisor;
        }
        return mdc(num1, num2, divisor-1);
    }

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira dois número para calcular o MDC: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int maximoDivisorComum = num1 < num2 ? mdc(num1, num2, num1) : mdc(num1, num2, num2);
        
        System.out.printf("O mdc(%d,%d) é %d\n", num1, num2, maximoDivisorComum);
        scan.close();
    }
}