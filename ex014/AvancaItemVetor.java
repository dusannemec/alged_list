import java.sql.Time;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AvancaItemVetor {

    public static void cadastraVetor(double[] vetor) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira o " + (i+1) + "o número:");
            vetor[i] = scan.nextDouble();
        }

    }
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        double[] elementos = new double[10];

        cadastraVetor(elementos);
        
        char menu;
        int indice = 0;
        double numeroAtual;
        do {
            numeroAtual = elementos[indice];
            
            System.out.println("Número atual: " + numeroAtual);
            System.out.println("\"+\": Próximo número;\n\"-\": Número anterior;\n\".\": Sair.");
            menu = scan.next().charAt(0);

            if (menu == '.') {}
            else if (menu == '+') {
                if (indice == elementos.length - 1) {
                    System.out.println("Não tem mais próximos números");
                } else {
                    indice++;
                }
            }
            else if (menu == '-') {
                if (indice == 0) {
                    System.out.println("Não existem números antes desse");
                } else {
                    indice--;
                }
            }
            else {
                System.out.println("Opção Inválida!");
            }

            System.out.println("\n\n\n\n");

        } while (menu != '.');
    }
}