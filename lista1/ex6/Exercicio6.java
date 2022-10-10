package ex6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int num[] = new int[10];
		int maior = 0, menor = 999; 
		
		for(int i = 0; i < 10; i++){
			System.out.print("Digite o " +(i+1)+"º número: ");
			num[i] = sc.nextInt();
			if(num[i] > maior){ 
				maior = num[i];
			}
		}
		for (int i = 0; i < 10; i++) {
			if(num[i] < menor){
				menor = num[i];
			}
		}
		System.out.println("Maior valor = "+ maior);
		System.out.println("Menor valor = "+ menor);
	}
}



