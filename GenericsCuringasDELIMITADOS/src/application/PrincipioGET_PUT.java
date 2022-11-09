package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrincipioGET_PUT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/////////////////// COVARIÂNCIA/////////////////////////
		///////////////////////////////////////////////////////
		//////// GET= OK   PUT= ERRO/////////////////////////
		/*
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		List<? extends Number> list = intList;
		Number x = list.get(0);
		System.out.println(x);
		//list.add(20); // erro de compilacao
	
		
		// Object
// Number         //Bollean         //Character
		
//Integer
// Byte
// Long
// Short
// Float
// Double
		
		
		
		
		/////////////////CONTRAVARIÂNCIA////////////////
		///////////////////////////////////////////////
		////////////// GET= ERRO  PUT=OK//////////////
		
	
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		List<? super Number> myNums = myObjs; // QUALQUER TIPO OU SUPER TIPO DE NUMBER, QUE SERIA O OBJECT.
		myNums.add(10);
		myNums.add(3.14);
		//Number x = myNums.get(0); // erro de compilacao */
		
		
		///////////////// PROBLEMA 2//////////////////
		/////////////////////////////////////////////
		
		List<Integer> myInts = Arrays.asList(1,2,3,4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);
		}
		public static void copy(List<? extends Number> source, List<? super Number> destiny) { // origem covariância,destino é contravariãncia.
		for(Number number : source) {
		destiny.add(number);
		}
		}
		public static void printList(List<?> list) {
		for (Object obj : list) {
		System.out.print(obj + " ");
		}
		System.out.println();
		
	}

}
