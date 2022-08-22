package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		 List<String>list= new ArrayList<>(); // não aceita tipos primitivos. wrapper classes.
		 
		 list.add("Maria");
		 list.add("Alex");
		 list.add("Yuri");
		 list.add("Ana");
		 list.add(2, "Marco"); // adicionar por índice.
		 
		 System.out.println("escreva um nome");
		 String name=sc.next();
		 
		 list.add(name);
		 
				
		       //System.out.println(list.size());// tamanho da list
		       for(String xxx:list){
					System.out.println(xxx);
		       }
					//System.out.println("-------------------------------");
					
		   // list.remove("Ana");
		  //  list.remove(1);
		   // list.removeIf(x-> x.charAt(0)=='M');// função lambd, predicado vai retornar v ou f.
		 //
			//for(String xx:list) {
				//System.out.println();
					//System.out.println(xx);
					//System.out.println("--------------------------------------");
				//}
				
				
				//System.out.println("Index of Yuri:"+list.indexOf("Yuri")); // n existe mais na lista respondeu -1
				
				//System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
				
				List<String> result = list.stream().filter(x -> x.charAt(0)=='A').collect(Collectors.toList());
				// converte para String, faz a operação Lambda, depois voltar para lista.
				
				
				//for(String xx:result) {
					//System.out.println();
						//System.out.println(xx);
				
				//}
				for(int i=0;i<=list.size();i++) {
			    System.out.println("--------------------------------------------");
				String namee = list.stream().filter(x -> x.charAt(0)=='A').findFirst().orElse(null); 
				// orelse se o elemento n existir ele retorna null.
				
				System.out.println(namee);
				//System.out.println(list.get(2));
		     // }	
				}
	}

}
