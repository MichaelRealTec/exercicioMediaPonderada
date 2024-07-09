package entities;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// media_ponderada
		int n, peso2 = 2, peso3 = 3, peso5 = 5;
		double caso2, caso3, caso5, mediaPonderada;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos casos voce vai digitar? ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Digite " + n + " numeros: ");
			caso2 = sc.nextDouble();
			caso3 = sc.nextDouble();
			caso5 = sc.nextDouble();
			mediaPonderada = ((caso2 * 2 + caso3 * 3 + caso5 * 5) / (peso2 + peso3 + peso5));
			System.out.printf("MEDIA = %.1f%n", mediaPonderada);
		}
		sc.close();
	}

}
