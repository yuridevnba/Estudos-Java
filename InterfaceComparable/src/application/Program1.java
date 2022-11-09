package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Faça um programa para ler um arquivo contendo nomes de pessoas (um nome por
				//linha), armazenando-os em uma lista. Depois, ordenar os dados dessa lista e mostra-los
				//ordenadamente na tela. Nota: o caminho do arquivo pode ser informado "hardcode".
		
		List<String> list = new ArrayList<>();
		String path = "C:\\temp\\in.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) { // reforçar ...
		String name = br.readLine();
		while (name != null) {
		list.add(name);
		name = br.readLine();
		}
		Collections.sort(list);
		for (String s : list) {
		System.out.println(s);
		}
		} catch (IOException e) {
		System.out.println("Error: " + e.getMessage());	
		
		}
	}
		
		
	}


