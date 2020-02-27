import java.util.Arrays;

public class IniciaVetor {
	public static void main(String [] args) {
		int[] valores = new int[100];
		for (int i = 0; i < valores.length; i++) {
			valores[i] = i;
		}

		System.out.println(Arrays.toString(valores));
	}
}
