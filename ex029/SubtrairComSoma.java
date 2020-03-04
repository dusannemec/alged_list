import java.util.Scanner;

public class SubtrairComSoma {
    public static int subtrair(int num1, int num2, int aux) {
        if (num1 + aux == num2) {
            return aux;
        }
        return subtrair(num1, num2, aux+1);
    }

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int aux = 0;

        System.out.println("Insira dois números");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();

        if (num1 < num2) {
            System.out.printf("%d - %d = %d\n", num2, num1, subtrair(num1, num2, aux));
        } else {
            System.out.printf("%d - %d = %d\n", num1, num2, subtrair(num2, num1, aux));
        }
        
        
    }
}