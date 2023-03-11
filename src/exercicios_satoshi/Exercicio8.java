/*
 * 8.	Receba o valor de um depósito em poupança.
 *  Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.

 */







package exercicios_satoshi;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o deposito");
		double dep = scan.nextDouble();
		double novoDep = (dep * 0.013) + dep;
		
		System.out.println("Esse é o valor do novo depossito " + novoDep);
		
		
		
		
		
		
	}

}
