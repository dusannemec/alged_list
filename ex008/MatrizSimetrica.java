import java.util.Arrays;

public class MatrizSimetrica {
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

    public static boolean simetrica(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        if (linhas != colunas) {
            return false;
        }

        int[][] transposta = transposta(matriz);

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if(matriz[i][j] != transposta[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String [] args) {
        int[][] matriz1 = {
            {1,2,3,4},
            {4,4,4,4},
            {8,1,2,9}
        };

        int[][] matriz2 = {
            {3,1,2},
            {1,4,3},
            {2,3,5}
        };

        int[][] matriz3 = {
            {3,3,2},
            {1,4,4},
            {2,3,5}
        };

        System.out.println(simetrica(matriz1));
        System.out.println(simetrica(matriz2));
        System.out.println(simetrica(matriz3));


        
    }
}