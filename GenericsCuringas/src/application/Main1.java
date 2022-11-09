package application;

import java.util.Arrays;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * List<Object> myObjs = new ArrayList<Object>(); List<?> myObjs = new
		 * ArrayList<Object>(); // é o supertipo de qualquer tipo de lista.
		 * List<Integer> myNumbers = new ArrayList<Integer>(); myObjs = myNumbers; //
		 * erro de compilação
		 * 
		 * Integer x =10; Object y; y=x;
		 */

		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String>myStr=Arrays.asList("ana","yuri","amor");
		printList(myStr);
	}

	public static void printList(List<?> list) {
		//list.add(4); // estou falando que minha lista é d qualquer tipo,
		//mas n o compilador,não sabe se o '4' è do mesmo tipo que estou esperando.
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
