package LojasInstrumentos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import LojasInstrumentosEntities.Alocação;
import LojasInstrumentosEntities.Instrumentos;
import LojasInstrumentosmodel.enums.Estado;
import LojasInstrumentosmodel.service.GeradoraFatura;
import LojasInstrumentosmodel.service.ZumbiInstrumentos;

public class Program1 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		//Uma locadora brasileira de intrumentos cobra um valor por hora para locações de até
		//20 horas. Porém, se a duração da locação ultrapassar 20 horas, a locação será
		//cobrada com base em um valor diário, posto pela locadora(finais de semana tem outros valores). Além do valor da locação, é acrescido no
		//preço o valor do imposto conforme regras da locadora que, no caso do ZumbiInstrumentos , é 20%
		//para valores até 100.00, ou 15% para valores acima de 100.00. Fazer um
	   //programa que lê os dados da locação (nome do instrumentos, estado instrumento (enums), instante inicial e final da
		//locação), bem como o valor por hora,  e o valor diário de locação será colocado pela locadora. O programa
		//deve então gerar a nota de pagamento (contendo valor da locação, valor do
		//imposto e valor total do pagamento) e informar os dados na tela.
		
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat x= new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		///////////ENTRADA Instrumentos /////////
		////////////////////////////////////////
		
		System.out.println("-------------------Dados Do Instrumentos----------------- ");
		System.out.println("Nome do Instrumento: ");
		String nome=sc.nextLine();
		
		System.out.println("ESTADO DO INSTRUMENTO");
		System.out.println("1)Novo       2)Conservado        3)Velho");
		String estado= sc.nextLine();
		
		
		
		
		
		//var instrumentos=new Instrumentos(nome, Estado.valueOf(estado));
		
		///////////////// ENTRADA ALOCAÇÃO ///////////
		//////////////////////////////////////////////
		
		System.out.println("------------------Dados da Alocação---------------------");
		
		System.out.println(" Data Inicial (dd/MM/yyyy HH:ss)");
		Date inicio=x.parse(sc.nextLine());
		
		System.out.println(" Data Final (dd/MM/yyyy HH:ss)");
		Date fim =x.parse(sc.nextLine());
		
		
		var Aloc= new Alocação(inicio, fim, new Instrumentos(nome,Estado.valueOf(estado)));
		
		
		//////////////// ENTRADA GeradoraFaturas ///////////////
		///////////////////////////////////////////////////////
		double p_hora =0;
		 long diff1 = Aloc.getData_inicial().getTime();
		 long diff2 = Aloc.getData_final().getTime();
		 
		 double hours=(double)(diff2-diff1)/1000/60/60;
		 Math.ceil(hours);
		
		
		 
		 if(hours<=20) {
		System.out.println("Qual o Preço por Hora?");
		p_hora= sc.nextDouble();
		 }
		 
		var Gfatura = new GeradoraFatura(p_hora, new ZumbiInstrumentos()); // upcasting
		
		if(hours>20) {
			System.out.println();
		System.out.println("Seu tempo deu "+hours+"horas,excedendo o limite de 20 horas. Então vc será cobrado por dia que é: R$ "+Gfatura.getP_dia()+" por dia .");
		
		}
		Gfatura.fatura(Aloc);
		
		//////////// Saída Fatura/////////////
		///////////////////////////////////////
		
		System.out.println("--------------------------FATURA:------------------------------- ");
		
		System.out.println("Pagamento Básico "+String.format("%.2f", Aloc.getFat().getPag_basico()));
		System.out.println("Taxa de Pagamento "+String.format("%.2f", Aloc.getFat().getTax()));
		System.out.println("Pagamento Total "+String.format("%.2f", Aloc.getFat().getTotalPagamento())); // chamando o getTotalPagamento por alocação n por fatura.
		
		sc.close();
	}

}
