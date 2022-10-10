package ex8;
import java.util.Scanner;
public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitura = new Scanner(System.in);

		String[] list = new String[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Insira elemento: ");

			list[i] = leitura.nextLine();

		}

		for (int i = 0; i < 10; i++) {
			System.out.println(list[i]);

		}

		System.out.println(list.length);

	}

}
