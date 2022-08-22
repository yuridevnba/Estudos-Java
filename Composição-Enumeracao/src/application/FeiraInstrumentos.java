package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Enums.EstadoInstrumento;
import entities.Inscrição;
import entities.Instrumento;
import entities.Locatário;

public class FeiraInstrumentos {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat y2= new SimpleDateFormat("dd/mm/YYYY");
		//SimpleDateFormat y3= new SimpleDateFormat("mm-YYYY");
		
		
		Scanner sc= new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("-----------------Dados do Locatário --------------------------");
		
		System.out.println("Nome Locatário: ");
		String name=sc.nextLine();
		System.out.println("Email: ");
		String email=sc.nextLine();
		
		Locatário locatario = new Locatário(name, email);
		
		
		System.out.println("-----------------Dados do Instrumento--------------------------");
		
		//String nome=name;
		System.out.println();
		System.out.println("qual instrumento vc vai alugar? ");
		String namee=sc.nextLine();
		
		
		System.out.println("Qual o estado do instrumento? ");
		String estado=sc.nextLine();
		
		
		Instrumento instrumento=new Instrumento(namee, EstadoInstrumento.valueOf(estado), 0, new Locatário(name,email));
		
		System.out.println();
	     System.out.println("-----------------AVISO-------------------------- ");
		//System.out.println("Esse é o frete fixo para todo Recife, R$ "+instrumento.getValorfrete() +"\n não trabalhamos com entrega de instrumento em um lugar fixo, só trabalhamos com entrega em domicílio.");
		
		System.out.println();
		System.out.println("-----------------Dados do Aluguel----------------------------------");
		System.out.println("Quantos alugueis vc vai querer fazer: ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("-------------- Informação aluguel"+(i+1)+"--------------------");
			
			
			System.out.println();
			System.out.println("DATA: dd/mm/YYYY");
			sc.nextLine();
			//String Date=sc.nextLine();
			java.util.Date contractDate= y2.parse(sc.next());
			System.out.println("Quantas Horas de Aluguel "+(i+1)+":");
			
			//sc.nextLine();
			Integer hora=sc.nextInt();
			//Date d =y2.parse(Date);
			
			Inscrição inscrição=new Inscrição(contractDate, hora);
			
			instrumento.Inscrição(inscrição);
		}
		System.out.println();
         System.out.println("------------- Pagamentos----------------------------------");
		System.out.println();
		System.out.println("Entre com mês e ano dos alugueis que vc quer consultar: ");
		System.out.println();
		System.out.println("DATA A PESQUISAR:  mm-YYYY");
		String up=sc.next();
		
		int month= Integer.parseInt(up.substring(0, 2));
		int year= Integer.parseInt(up.substring(3));
		
		System.out.println();
		System.out.println("---------------Dados-----------------------------------------");
		System.out.println(locatario);
		System.out.println();
		System.out.println(instrumento);
		System.out.println();
		System.out.println("Valor a pagar pelo tempo pesquisado; "+up+", R$"+instrumento.ValorPago(year, month)+" .");
		
	}

}
