import java.util.Scanner;

public class CalculaFatorial {
    public static int fatorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fatorial(n-1);
    }

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o número para calcular o fatorial: ");
        int num = scan.nextInt();

        System.out.println(fatorial(num));

        scan.close();
    }
}