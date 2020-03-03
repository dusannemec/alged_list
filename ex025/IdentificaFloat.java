import javax.swing.JOptionPane;

public class IdentificaFloat {
    
    public static float[] cadastraVetorFloat(int i, float[] vetor) {
        if (i < vetor.length) {
            vetor[i] = Float.parseFloat(JOptionPane.showInputDialog("Insira o " + (i+1) + "o número:"));
            return cadastraVetorFloat(i+1, vetor);
        }
        return vetor;
    }

    public static int verificaPosicaoVetor(float numComparar,int i, float[] vetor) {
        if (vetor[i] == numComparar) {
            return i;
        } else if (i >= vetor.length) {
            return -1;
        } else {
            return verificaPosicaoVetor(numComparar, i+1, vetor);
        }
    }


    public static void main(String [] args) {
        
        float[] vetor = new float[10];

        cadastraVetorFloat(0, vetor);

        float numComparar = Float.parseFloat(JOptionPane.showInputDialog("Insira um número para verificar a posição no vetor:"));
        int posicao = verificaPosicaoVetor(numComparar, 0, vetor);

        JOptionPane.showMessageDialog(null, posicao == -1 ? "Número não encontrado" : "O número " + numComparar + " está localizado no índice " + posicao + " do vetor.");
    }
}