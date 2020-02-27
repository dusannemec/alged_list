import java.util.Scanner;

public class EqQuadratica {
    public static double delta(double a, double b, double c) {
        return (b*b) - 4 * a * c;
    }

    public static double x1(double a, double b, double c) {
        return (-b+Math.sqrt(delta(a,b,c)))/(2*a);
    }

    public static double x2(double a, double b, double c) {
        return (-b-Math.sqrt(delta(a,b,c)))/(2*a);
    }

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        double a, b, c;

        System.out.println("Insira o valor de a:");
        a = scan.nextDouble();

        System.out.println("Insira o valor de b:");
        b = scan.nextDouble();

        System.out.println("Insira o valor de c:");
        c = scan.nextDouble();

        double delta = delta(a, b, c);

        if (delta > 0) {
            System.out.println("Delta: " + delta);
            System.out.println("Por ser maior que zero, existem duas raízes possíveis");
            System.out.println("X1: " + x1(a, b, c));
            System.out.println("X2: " + x2(a, b, c));
        }
        else if (delta == 0) {
            System.out.println("Delta: " + delta);
            System.out.println("Por ser igual a zero, só existe uma raiz");
            System.out.println("X: " + x1(a, b, c));
        }
        else {
            System.out.println("Delta: " + delta);
            System.out.println("Por ser negativo, as raízes são imaginárias");
        }

        scan.close();
    }
}