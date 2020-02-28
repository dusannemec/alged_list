import java.util.Scanner;

public class SequenciaFibonacci {
    public static int fibonacci(int n) {
        if (n <= 0) return 0;
        else if (n == 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int num = scan.nextInt();

        System.out.println("O número na posição " + num + " na sequência de Fibonacci é: " + fibonacci(num));
        
        scan.close();
    }
}