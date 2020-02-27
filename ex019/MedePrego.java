import java.util.Scanner;

public class MedePrego {

    public static int verificaComprimentoMaior(Prego[] lst, int atual, int maior) {
        if (lst[maior].getComprimento() < lst[atual].getComprimento()) {
            return atual;
        }
        return maior;
    }

    public static int verificaDiametroMenor(Prego[] lst, int atual, int menor) {
        if (lst[menor].getDiametro() > lst[atual].getDiametro()) {
            return atual;
        }
        return menor;
    }

    public static void printaPrego(int id, Prego[] pregos) {
        System.out.println("Prego " + (id+1) + ": \nComprimento: " + pregos[id].getComprimento() +" mm\nDiametro: " + pregos[id].getDiametro() + " mm");
    }

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

            idComprimentoMaior = verificaComprimentoMaior(pregos, i, idComprimentoMaior);
            idDiametroMaisFino = verificaDiametroMenor(pregos, i, idDiametroMaisFino);
    
        }

        for (int i = 0; i < pregos.length; i++) {
            printaPrego(i, pregos);
        }

        System.out.println("\nComprimento médio das amostras: " + (somaComprimento/10) + " mm");
        System.out.println("Diametro médio das amostras: " + (somaDiametro/10) + " mm\n");

        System.out.println("Prego com maior comprimento:");
        printaPrego(idComprimentoMaior, pregos);
        
        System.out.println("Prego mais fino:");
        printaPrego(idDiametroMaisFino, pregos);
    }
}