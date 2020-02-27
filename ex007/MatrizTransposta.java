import java.util.Arrays;

public class MatrizTransposta {
    public static int[][] transposta(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        
        int[][] transposta = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        return transposta;
    }
    public static void main(String [] args) {
        int[][] matriz = {{1,2,3,4},
                          {4,4,4,4},
                          {8,1,2,9}};
        int[][] transposta = transposta(matriz);

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }

        for (int i = 0; i < transposta.length; i++) {
            System.out.println(Arrays.toString(transposta[i]));
        }
    }
}