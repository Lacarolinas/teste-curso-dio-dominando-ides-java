package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato ();
		Livros livros = new Livros ();
		
		System.out.println(gato);
		System.out.println(livros);
				
				
	}
		// TODO Auto-generated method stub
		/*int a=6;
		int b=5;
		System.out.println("Hello world!" + (a+b));

	}*/

}
class Livros {
	private String nome;
	private String npag;
}
