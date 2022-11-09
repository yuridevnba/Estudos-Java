package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class SETmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set<String> set = new HashSet<>(); // mais rápido, mas n garante a ordem.
		//Set<String> set = new TreeSet<>(); // faz a Ordenação.
		Set<String> set = new LinkedHashSet<>(); // mantem a ordem.
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		//set.remove("Tablet");
		//set.removeIf(x->x.length()>=3); // remover um elemento x, tais que o comprimento, seja x maior igual a 3.
		set.removeIf(x->x.charAt(0)=='T'); // predicado
		
		//System.out.println(set.contains("Notebook"));// existe esse elemento no set.
		for (String p : set) {
		System.out.println(p);
	}

	}
}
