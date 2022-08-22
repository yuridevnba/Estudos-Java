package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileBuffered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		////////// FORMA DE ABRIR E FECHAR MANUALMENTE AS Streams/////////////
		//////////////////////////////////////////////////////////////////////
		
		String path = "C:\\temp\\trabalhandocomarquivoS.txt";
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
		fr = new FileReader(path); // estabelecendo uma sequência de leitura a partir do arquivo que estiver nesse caminho.
		br = new BufferedReader(fr); // é instanciado a partir do filereader.
		
		String line = br.readLine(); // ler uma linha, quando o arquivo estiver no final, vai retornar null.
		while (line != null) {
		System.out.println(line); // imprimir na tela o line
		line = br.readLine(); // imprimir a próxima linha.
		}
		} catch (IOException e) {
		System.out.println("Error: " + e.getMessage());
		} finally {
		try {
		if (br != null) // pode ocorrer uma exceção na hora de fechar os streamns.
		br.close();
		if (fr != null)
		fr.close();
		} catch (IOException e) {
		e.printStackTrace(); // querer ver o caminho do erro.
		}
		}
		}
	}


