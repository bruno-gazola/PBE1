package programacao_backend;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do raio do círculo: ");
		double raio = sc.nextDouble();

		double pi = 3.14159;
		double area = pi * (raio * raio);
		
		System.out.printf("A área do círculo é igual a %.4f m2",area);
		
        sc.close();
		
	}

}
