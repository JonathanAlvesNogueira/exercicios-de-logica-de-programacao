// 3.	Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
package exercicios_satoshi;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double base;  double altura; double area;
		
		System.out.println("Informe oi valor da base");
		base  = scan.nextDouble();
		System.out.println("Informe o valor da altura");
		altura = scan.nextDouble();
		
		area = ((base * altura)/ 2);
		System.out.println("Essa é a area" + area);
		
		
	}
}
