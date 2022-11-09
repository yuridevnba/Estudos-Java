package application;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		////////////// EQUALS//////////////
		//////////////////////////////////
		
		String a = "Maria";
		String b = "Alex";
		System.out.println(a.equals(b));
		
		
		
		///////////HashCode///////////////
		//////////////////////////////////
		
		String c = "Maria";
		String d = "Alex";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		// gera um número inteiro para representar o nome, as vezes pode nomes
		// diferentes ter o mesmo número inteiro, é difícil pq um número interiro 
		// tem 4 bilhões de possibilidades, mas pode acontecer de se repetir.
		
		// mesmo tendo a possibilidade de dois objetos diferentes ter a mesma numeração
		// o hashcode é utilizado pq ele é muito rápido, mesmo que a precisão n der 100%.
		
		
		// uma lista de 1 milhão de nomes, vc vai pecorrendo a lista com o hashcode,
		// se em algum lugar dá uma igualdade, é só confirma com o equals.
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
