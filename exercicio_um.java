package programacao_backend;

import java.util.Scanner;

public class exercicio_um {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
		int primeiroNum = sc.nextInt();

        System.out.println("Informe o primeiro número: ");
		int segundoNum = sc.nextInt();
		
		int soma = primeiroNum + segundoNum;
		
		System.out.println("A soma desses números é igual a "+soma);

        
        sc.close();
	}

}
