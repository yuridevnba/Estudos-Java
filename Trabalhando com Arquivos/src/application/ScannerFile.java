package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;




public class ScannerFile {

	public static void main(String[] args) {
		
		File file = new File("C:\\temp\\trabalhandocomarquivos.txt"); // vai encapsular todo processo de acessar o arquivo.
		Scanner sc = null; 
		try {   // o try foi necessário pq o scanner vai tentar abrir o arquivo e isso pode gerar uma exceção.
		sc = new Scanner(file); // instanciar o scanner apartir do arquivo, em vez de passar a classe (system.in)
		while (sc.hasNextLine()) { // testar se existir uma próxima linha no arquivo,entendi como se tiver uma próxima linha quer dizer que o arquivo existe.
		System.out.println(sc.nextLine());// printar a linha.
		}
		}
		catch (IOException e) {
		System.out.println("Error: " + e.getMessage());
		}
		finally {   // fechamento do recurso no bloco, usando o finally. fechar o scanner independente se deu certo o try ou n.
		if (sc != null) {
		sc.close(); // se fosse ele sozinho iria dar um nullpointexception, pq o scanner pode ser null, caso der td errado.
		}
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
