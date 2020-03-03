import java.util.Scanner;

public class ElevandoNumerosRecursividade {
    public static int elevar(int num1, int num2, int aux) {
        if (aux < num2) {
            return num1 * elevar(num1, num2, aux+1);
        }
        return num1;
    }

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.printf("%d^%d = %d\n", num1, num2, elevar(num1, num2, 1));
    }
}