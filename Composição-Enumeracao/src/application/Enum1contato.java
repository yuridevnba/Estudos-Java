package application;

import java.time.LocalDateTime;

import Enums.Enum1;
import entities.Enumprimeirocontato;



public class Enum1contato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Enumprimeirocontato oder= new Enumprimeirocontato(1080, LocalDateTime.now(),Enum1.PENDING_PAYMENT);
		// converteu de enum para string, o status.
		 
		
		System.out.println(oder);
		
		///////////////////  CONVERSÃO DE STING PARA ENUM///////////
		
		// uma aplicação que vai pedir para o usuário digitar algo para salvar como enum, mas oq ele digitar vai entar como string.
		
		Enum1 os1= Enum1.DELIVERED; // como se ele quisesse mostrar ao usuário o status do seu pedido, mas como string. // instanciou um objeto OrdersStatus com esse valor apresentado.
		Enum1 os2= Enum1.valueOf("DELIVERED");// valueOf converte para a forma de delivery.
		
		System.out.println("mostrou na forma de String: "+os1);
		System.out.println(os2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
