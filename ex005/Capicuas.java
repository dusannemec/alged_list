import java.util.Arrays;

public class Capicuas {
	public static void main(String [] args) {
		int[] vetor = {0, 1, 1, 0, 3, 2, 4, 4, 2, 2, 4, 7, 7, 7, 7, 7};
		int qteDeCapicuas = 0;
		int num1, num2, num3, num4;
		int limite = vetor.length - 4;

		for (int i = 0; i < vetor.length; i++) {
			if (i <= limite) {
				num1 = vetor[i];
				num2 = vetor[i+1];
				num3 = vetor[i+2];
				num4 = vetor[i+3];

				String comparador = "" + num1 + num2 + num3 + num4;
				String comparadorReverso = "" + num4 + num3 + num2 + num1;

				if (comparador.equals(comparadorReverso)) {
					System.out.println(String.format("Capicua %d: %s", ++qteDeCapicuas, comparador));
				}
			}
		}

		System.out.println("Vetor: " + Arrays.toString(vetor));
		System.out.println("Quantidade de capicuas: " + qteDeCapicuas);	
	}
}
