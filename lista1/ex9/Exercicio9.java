package ex9;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String qtdLitros = s.nextLine();
		String precoLitro = s.nextLine();

		Double qtd = Double.valueOf(qtdLitros);
		Double preco = Double.valueOf(precoLitro);

	}
    private static Double calculaAbastecimento(Double qtd, Double preco) {
    	return qtd*preco;
    }
	
}

