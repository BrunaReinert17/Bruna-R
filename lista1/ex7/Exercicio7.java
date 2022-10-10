package ex7;
import java.util.Scanner;
public class Exercicio7 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


           Scanner leitura = new Scanner(System.in);

            String[] vetor = new String[10];
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Insira num:");
                vetor[i] = leitura.nextLine();
            }

            vetor[0] = "num";
            for (int i = 0; i < vetor.length; i++) {

            }
            System.out.println(vetor[vetor.length-1]);

        }


    }
