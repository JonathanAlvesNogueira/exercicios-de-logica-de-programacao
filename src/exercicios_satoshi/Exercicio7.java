package exercicios_satoshi;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

        System.out.println("Informe o comprimento do paralelepípedo:");
        double comprimento = scan.nextDouble();

        System.out.println("Informe a largura do paralelepípedo:");
        double largura = scan.nextDouble();

        System.out.println("Informe a altura do paralelepípedo:");
        double altura = scan.nextDouble();

        double volume = comprimento * largura * altura;

        System.out.println("O volume do paralelepípedo é: " + volume);
		
		
		
	}

}
