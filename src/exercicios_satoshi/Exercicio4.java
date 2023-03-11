/*4.	Receba a temperatura em graus Celsius.
 *  Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.*/



package exercicios_satoshi;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em celsius");
		int celsius = scan.nextInt();
		
		double f = (((9 * celsius) + 160)/5);
		
		System.out.println("Essa é a temperatura em fahrenheit: " + f);
		
		
		
		
		
	}

}
