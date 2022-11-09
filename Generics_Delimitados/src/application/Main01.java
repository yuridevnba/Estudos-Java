package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		//List<Integer> list = new ArrayList<>();
		List<Product> list = new ArrayList<>();

		String path = "C:\\temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine(); // faz a leitura, linha por linha.
			while (line != null) {
				String[]fields=line.split(","); // nova linha de código.
				list.add(new Product(fields[0],Double.parseDouble(fields[1])));
				//list.add(Integer.parseInt(line));
				line = br.readLine();
			}

			//Integer x = CalculationService.max(list);
			Product x = CalculationService.max(list);
			System.out.println("Max:");
			System.out.println(x);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
