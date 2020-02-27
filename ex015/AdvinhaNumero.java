import javax.lang.model.type.NullType;
import javax.swing.JOptionPane;

public class AdvinhaNumero {
    public static int opcaoACadastrarNumSecreto() {
        int numeroSecreto;
        do {
            numeroSecreto = Integer.parseInt(JOptionPane.showInputDialog("Insira o número secreto: "));
            if (numeroSecreto < 0) {
                JOptionPane.showMessageDialog(null, "O número deve ser inteiro e positivo");
            }
        } while (numeroSecreto < 0);
        
        return numeroSecreto;
    }

    public static int opcaoBJogar(int numeroSecreto) {
        int numeroDigitado; 
        int palpites = 0;
        do {
            numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog(String.format("Palpites: %d\n\nTente advinhar o número:", palpites)));

            if (numeroDigitado < 0) {
                JOptionPane.showMessageDialog(null, "SAINDO");
            }
            else if (numeroDigitado > numeroSecreto) {
                JOptionPane.showMessageDialog(null, "ALTO");
                palpites++;
            }
            else if (numeroDigitado < numeroSecreto) {
                JOptionPane.showMessageDialog(null, "BAIXO");
                palpites++;
            }
            else {
                JOptionPane.showMessageDialog(null, "ACERTOU!");
            }
        } while (numeroDigitado != numeroSecreto && numeroDigitado >= 0);
        
        return palpites;
    }

    public static void opcaoCResultado(int palpites) {
        JOptionPane.showMessageDialog(null, "Resultado do ultimo jogo: " + palpites);
    }

    public static void opcaoDSair() {
        JOptionPane.showMessageDialog(null, "Tchau, obrigado por jogar :D");
    }
    
    public static void main(String [] args) {
        String menu;
        int numeroSecreto = -1, palpites = -1;
        do {
            menu = (JOptionPane.showInputDialog("Advinha Número\n\nA- Cadastra número\n\nB- Jogar\n\nC- Resultado\n\nD- Sair")).toUpperCase();
            
            if (menu.equals("A")) {
                numeroSecreto = opcaoACadastrarNumSecreto();
            }
            else if (menu.equals("B")) {
                if (numeroSecreto == -1) {
                    JOptionPane.showMessageDialog(null, "É preciso cadastra um número secreto antes de jogar");
                }
                else {
                    palpites = opcaoBJogar(numeroSecreto);
                } 
            }
            else if (menu.equals("C")) {
                if (palpites == -1) {
                    JOptionPane.showMessageDialog(null, "É preciso ter jogado pelo menos uma vez antes para ver os resultados");
                }
                else {
                    opcaoCResultado(palpites);
                }
            }
            else if (menu.equals("D")) {
                opcaoDSair();;
            }
            else {
                JOptionPane.showMessageDialog(null, "Opção Inválida!");
            }
        } while (!(menu.equals("D")));
    }
}