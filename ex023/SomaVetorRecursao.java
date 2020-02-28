public class SomaVetorRecursao {
    public static int somaVetor(int[] vetor, int i) {
        if (i <= 0) return vetor[0];
        else return vetor[i] + somaVetor(vetor, i-1);
    }
    public static void main(String [] args) {
        int [] vetor = {1, 7, 9, 3, 2, 20, 1, 60, 9, 145};

        System.out.println(somaVetor(vetor, vetor.length-1));

    }
}