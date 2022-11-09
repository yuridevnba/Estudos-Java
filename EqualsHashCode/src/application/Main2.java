package application;

import entities.Client;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var c1= new Client("Maria","maria@gmail.com");
		
		//var c2= new Client("Alex","alex@gmail.com");
		var c2= new Client("Maria","maria@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		System.out.println(c1==c2);// com exceção de tipos como o string, vai
		// comparar a referência de memória, 2 objetos diferentes, são alocados no hip,
		// com posições diferentes.  referência de memória diferentes.
		
		
		String s1=("Test");
		String s2=("Test");
		
		String s3= new String("Test");
		String s4= new String("Test");
		
		
		System.out.println(s1==s2);
		// o compilador vai tratar essa forma literal com um tratamento especial,
		// diferentemente se vc instanciar um objeto do tipo string.
		
		
		System.out.println(s3==s4);
		
		
		
		
		
		
		
		
	}

}
