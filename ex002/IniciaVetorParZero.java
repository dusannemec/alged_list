import java.util.Arrays;

public class IniciaVetorParZero {
	public static void main(String [] args) {
		int[] valores = new int[100];

		for (int i = 0; i < valores.length; i++) {
			if (i % 2 == 0) {
				valores[i] = 0; 
			} else {
				valores[i] = i;
			}
		}

		System.out.println(Arrays.toString(valores));
	}
}
