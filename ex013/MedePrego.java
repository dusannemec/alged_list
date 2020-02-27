import java.util.Scanner;

public class MedePrego {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        
        Prego[] pregos = new Prego[10];

        double comprimento, diametro;
        double somaComprimento = 0, somaDiametro = 0;
        int idComprimentoMaior = 0, idDiametroMaisFino = 0;
        for(int i = 0; i < pregos.length; i++) {
            System.out.println("Digite o comprimento do " + (i+1) + "o prego:");
            comprimento = scan.nextDouble();

            System.out.println("Digite o diametro do " + (i+1) + "o prego:");
            diametro = scan.nextDouble();

            somaComprimento += comprimento;
            somaDiametro += diametro;

            Prego prego = new Prego(comprimento, diametro);

            pregos[i] = prego;

            if (pregos[idComprimentoMaior].getComprimento() < pregos[i].getComprimento()) {
                idComprimentoMaior = i;
            }
            if (pregos[idDiametroMaisFino].getDiametro() > pregos[i].getDiametro()) {
                idDiametroMaisFino = i;
            }
    
        }

        for (int i = 0; i < pregos.length; i++) {
            System.out.println("Prego " + (i+1) + ": \nComprimento: " + pregos[i].getComprimento() +" mm\nDiametro: " + pregos[i].getDiametro() + " mm");
        }

        System.out.println("\nComprimento médio das amostras: " + (somaComprimento/10) + " mm");
        System.out.println("Diametro médio das amostras: " + (somaDiametro/10) + " mm\n");

        System.out.println("Prego com maior comprimento:");
        System.out.println("Prego " + idComprimentoMaior + ": \nComprimento: " + pregos[idComprimentoMaior].getComprimento() +" mm\nDiametro: " + pregos[idComprimentoMaior].getDiametro() + " mm\n");
        
        System.out.println("Prego mais fino:");
        System.out.println("Prego " + idDiametroMaisFino + ": \nComprimento: " + pregos[idDiametroMaisFino].getComprimento() +" mm\nDiametro: " + pregos[idDiametroMaisFino].getDiametro() + " mm");
    }
}