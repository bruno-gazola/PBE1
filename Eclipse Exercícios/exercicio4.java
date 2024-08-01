package programacao_backend;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o código da peça: ");
		int codePecas = sc.nextInt();
		
		System.out.printf("Informe a quantidade de peças: ");
		int quantPecas = sc.nextInt();
		
		System.out.println("Informe o valor de cada peça: ");
		double valorPeca = sc.nextDouble();

		System.out.println("Informe o código da segunda peça: ");
		int codePecas2 = sc.nextInt();
		
		System.out.printf("Informe a quantidade de peças: ");
		int quantPecas2 = sc.nextInt();
		
		System.out.println("Informe o valor de cada peça: ");
		double valorPeca2 = sc.nextDouble();
		
		double calculo = (quantPecas * valorPeca)+(quantPecas2 * valorPeca2);
		
		System.out.println("O total a ser pago pelas peças "+codePecas+" e "+codePecas2+" é de R$"+calculo);
        
        sc.close();

	}

}
