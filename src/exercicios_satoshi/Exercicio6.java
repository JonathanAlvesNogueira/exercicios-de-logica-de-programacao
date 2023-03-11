
// 6.	Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.

package exercicios_satoshi;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int aux;
		
		System.out.println("informe o valor do primeiro numero");
		int x = scan.nextInt();
		System.out.println("informe o valor do segundo numero");
		int y = scan.nextInt();
		
		aux = x;
		x = y;
		y = aux;
		System.out.println("Esse é o novo valor do primeiro numero " + x + " esse é o novo valor para o segundo numero" + y);
		
		
		
		
		
		
	}

}
