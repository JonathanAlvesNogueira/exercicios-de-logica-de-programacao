// 2.	Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.

package exercicios_satoshi;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double sal = scan.nextDouble();
		
		double novoSal =  sal * 0.15;
		
		System.out.println(novoSal);
}
	
	
	
	
	
}
