import java.util.Scanner;

public class MultiplicandoSemMultiplicar {
    public static int multiplicar(int num1, int num2, int aux) {
        if (aux < num2) {
            return num1 + multiplicar(num1, num2, aux+1);
        }
        return num1;
    }
    
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira dois números");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.printf("%d x %d = %d\n", num1, num2, multiplicar(num1, num2, 1));

        scan.close();
    }
}