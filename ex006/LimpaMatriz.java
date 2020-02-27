import java.util.Arrays;

public class LimpaMatriz {
    public static void limpaMatriz(int[][] matriz) {
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = -1;
            }
        }
    }

    public static void main(String [] args) {
        int[][] matriz1 = new int[3][5];
        int[][] matriz2 = new int[4][10];

        limpaMatriz(matriz1);
        limpaMatriz(matriz2);

        for (int i = 0; i < matriz1.length; i++) {
            System.out.println(Arrays.toString(matriz1[i]));
        }
        
        for(int i = 0; i < matriz2.length; i++) {
            System.out.println(Arrays.toString(matriz2[i]));
        }
    }
}