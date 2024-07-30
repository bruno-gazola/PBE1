package programacao_backend;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número do funcionário: ");
		int numFunc = sc.nextInt();
		
	    System.out.println("Quantas horas você trabalha por dia? ");
		double horas = sc.nextDouble();
		
		System.out.println("Quanto você ganha por hora? ");
		double ganhaHora = sc.nextDouble();
		
		double calculo = horas * ganhaHora * 30;
		
		System.out.printf("O fúncionário número %d ganha um salário mensal de R$%.2f",numFunc,calculo);
		


        
        sc.close();

	}

}
