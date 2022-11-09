package application;

import java.util.List;

public class CalculationService {
	
        //public static Integer max(List<Integer>list) {
	public static<T extends Comparable<T>> T max(List<T> list) {
	//public static<T extends Comparable<T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		//Integer max = list.get(0);
	    T max = list.get(0);
		for ( T item : list) {
			if (item.compareTo(max) > 0) { // estava dando erro pq n especifiquei que o tipo T, vai ter a operação comparableTo
				max = item;                 // pra resolver vai ser preciso especificar que o tipo <T> é um tipo comparable, dessa forma
				                               // é possível usar o método comparableTo da interface comparable.
			}
		}
		return max;
	}
}