// 1.	Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.



package exercicios_satoshi;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o valor do lado");
		int lado = scan.nextInt();
		
		int area = lado * lado;
		
		System.out.println("Essa é a area " + area);
		
		
		
		
		
	}

}
