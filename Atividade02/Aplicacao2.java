package prjCaneta;

import java.util.Scanner;

public class Aplicacao2 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

		
		Livro livro01 = new Livro("Alice no País das Maravilhas","Bruno Gazola");
		Livro livro02 = new Livro("Quarto de Despejo","Pedro Francisco");
		
		System.out.println("Livros disponíveis: ");
		System.out.print("01, ");
		livro01.status();
		System.out.print("02, ");
		livro02.status();
		
		System.out.println("Qual livro você deseja alugar? ");
	    int escolha = sc.nextInt();
		
	sc.close();
	}

}
