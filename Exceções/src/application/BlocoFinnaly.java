package application;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class BlocoFinnaly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		File file = new File("C:\\temp\\in.txt");
				//("Users\\yuri-\\OneDrive\\Área de Trabalho\\Atestado//testefinally");// na instanciação passou o caminho do arquivo.
				//("C:\\temp\\in.txt");
		Scanner sc = null;
		try {
		sc = new Scanner(file); // instanciar o scanner apontando para o arquivo.
		while (sc.hasNextLine()) { // pecorrer o arquivo, as linhas do arquivo.
		System.out.println(sc.nextLine());
		}
		} 
		catch (IOException e) { // pega a exceção caso o arquivo n exista.
		System.out.println("Error opening file: " + e.getMessage());
		} 
		finally {
		if (sc != null) {
		sc.close(); // fechar o scanner e fecha o arquivo.
		}
		System.out.println("Finally block executed! ");
		}
		}
		

	}


