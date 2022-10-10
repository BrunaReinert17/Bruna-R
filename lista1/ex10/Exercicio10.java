package ex10;
import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitura = new Scanner(System.in);

		Double nt1, nt2, nt3, media = 0.0;

		System.out.println("Digite seu nome: ");
		String nome = leitura.nextLine();

		System.out.println("Digite primeira nota 1: ");
		String nota1 = leitura.nextLine();
		System.out.println("Digite segunda nota 2: ");
		String nota2 = leitura.nextLine();
		System.out.println("Digite terceira nota 3: ");
		String nota3 = leitura.nextLine();

		nt1 = Double.valueOf(nota1);
		nt2 = Double.valueOf(nota2);
		nt3 = Double.valueOf(nota3);

		media = (nt1 + nt2 + nt3) / 3;

		System.out.println(nome + ", a sua media sera = " + media);
		System.out.println("Aprovado");
	}

}
