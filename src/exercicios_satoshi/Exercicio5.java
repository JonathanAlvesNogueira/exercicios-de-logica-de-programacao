/*
 * 5.	Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0).
 *  Calcule e mostre as raízes reais (considerar que a equação possue2 raízes).
 * 
 * 
 */






package exercicios_satoshi;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		double delta = Math.pow(b, 2)  - 4 * a * c;
		if(delta > 0) {
			double x1 = -(b) + Math.sqrt(delta)/2*a;
			double x2 = -(b) - Math.sqrt(delta)/2*a;
			System.out.println("Esse é o valor da primeira raiz = " + x1 + " Esse é o valor da segunda raiz: " + x2);
		}
		
		
		
		
		
		
		
		
		
	}

}
