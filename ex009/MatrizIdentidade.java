public class MatrizIdentidade {
    public static boolean identidade(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        if (linhas != colunas) {
            return false;
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j && matriz[i][j] != 1) {
                    return false;
                }
                else if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String [] args) {
        int[][] matriz1 = {
            {1,0,0},
            {0,1,0},
            {0,0,1}
        };

        int[][] matriz2 = {
            {1,0,0},
            {0,1,0}
        };

        int[][] matriz3 = {
            {1,0,1},
            {0,1,0},
            {0,0,1}
        };

        int[][] matriz4 = {
            {1,0,0},
            {0,1,0},
            {0,0,0}
        };

        System.out.println(identidade(matriz1));
        System.out.println(identidade(matriz2));
        System.out.println(identidade(matriz3));
        System.out.println(identidade(matriz4));
    }
}