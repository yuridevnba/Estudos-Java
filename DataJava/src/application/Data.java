package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Data {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
////////////////////////////////DATE//////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////


SimpleDateFormat datinha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

Date y1= datinha.parse("25/10/2020 15:48:15");


System.out.println(y1);

/////////////////// exibir a data atual/////////////
System.out.println();
System.out.println("Data atual:");
LocalDate myObj = LocalDate.now();
System.out.println(myObj);


/////////////// exibir a hora atual//////////////////

System.out.println();
System.out.println("Hora Atual:");
LocalTime myhr=LocalTime.now();
System.out.println(myhr);


////////// exibir hora e data atuais/////////////////
System.out.println();
System.out.println("Hora e Data Atual:");
LocalDateTime myhrdt =LocalDateTime.now();
System.out.println(" sem o formato: "+myhrdt);


/////////// Formatação de data e hora/////////////////



DateTimeFormatter myFormtObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

String formacerta= myhrdt.format(myFormtObj);
System.out.println();
System.out.println("Forma ajustada: "+formacerta);


/**
SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); // conversão de String para data, dá o formato que a
															// data vai ter, dia, mês, ano
SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

java.util.Date y1 = sdf1.parse("25/06/2018");// a operação parse recebe um dado no formato d String e converter
												// para data
java.util.Date y2 = sdf2.parse("25/06/2018 15:42:07");

System.out.println(y1);
System.out.println(y2);
*/

//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

//java.util.Date d = sdf.parse("2018-03-20T15:42:07");
//System.out.println(d);
//Calendar cal = Calendar.getInstance();
//cal.setTime(d);
//cal.add(Calendar.HOUR_OF_DAY, 4);
//d = cal.getTime();
//System.out.println(sdf.format(d));

//Date data = new Date();
//System.out.println("Data Agora: "+data);
Calendar c = Calendar.getInstance();
//System.out.println("data atual "+c.getTime());


System.out.println("Data/Hora atual: "+c.getTime());
System.out.println("Ano: "+c.get(Calendar.YEAR));
System.out.println("Mês: "+c.get(Calendar.MONTH));
System.out.println("Dia do Mês: "+c.get(Calendar.DAY_OF_MONTH));
	}

}
