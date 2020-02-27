import java.util.Scanner;

public class VerificaPrimo {
    public static boolean primo(int p) {
        int mult = 0;
        for (int i = 2; i < p; i++) {
            if (p % i == 0) {
                mult++;
            } 
        }
        if (mult > 0) {
            return false;
        } else {
            return true;
        }
    }
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        
        int entrada;
        do {
            System.out.println("Digite um número para verificar se ele é primo: ");
            entrada = scan.nextInt();
            if(entrada == -1) {}
            else if (primo(entrada)) {
                System.out.println("É primo");
            }
            else {
                System.out.println("Não é primo");
            }
            
        } while (entrada != -1);

        scan.close();
    }
}