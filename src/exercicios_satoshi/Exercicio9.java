//9.	Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados


package exercicios_satoshi;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Informe o valor do primeiro numero");
		int num = scan.nextInt();
		num = (int) Math.pow(num, 2);
		System.out.println("Informe o valor do segundo numero");
		int num2 = scan.nextInt(); 
		num2 = (int) Math.pow(num2, 2);
		
		int somaQuadrados = num + num2;
		
		System.out.println("Esse é o valor da soma dos quadrados" + somaQuadrados);
		
		
	}

}
