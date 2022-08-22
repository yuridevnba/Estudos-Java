package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {// throws ParseException { // propaga exceção colocarndo throws
											// ParseException,
		// Fazer um programa para ler os dados de uma reserva de hotel (número do
		// quarto, data
		/// de entrada e data de saída) e mostrar os dados da reserva, inclusive sua
		// duração em
		// dias. Em seguida, ler novas datas de entrada e saída, atualizar a reserva, e
		// mostrar
		// novamente a reserva com os dados atualizados. O programa não deve aceitar
		// dados
		// inválidos para a reserva, conforme as seguintes regras:
		// - Alterações de reserva só podem ocorrer para datas futuras
		/// - A data de saída deve ser maior que a data de entrada

		
		//////////////   Entrada nºquarto, checkIn,checkOut.///////////////////
		////////////////////////////////////////////////////////////////////
		                   /////////////////////////
		
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.println("Room number: ");
			int number = sc.nextInt();
	
			System.out.println("Check-in date (dd/MM/yyyy):");
			Date checkIn = sdf.parse(sc.next());
	
			System.out.println("Check-out date (dd/MM/yyyy):");
			Date checkOut = sdf.parse(sc.next());
	
			// if (!checkOut.after(checkIn)) { // método after testa se uma data é depois da
			// outra.
			// System.out.println("Error in reservation: Check-out date must be after
			// check-in date");
			// }
			// else {
			var reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
	
			 ///////////////// UPDATE check-in, check-out////////////////////////////////
			////////////////////////////////////////////////////////////////////////////
			                  ///////////////////////////////
			System.out.println();
	
			System.out.println("Enter date to update the reservation: ");
			System.out.println("Check-in date (dd/MM/yyyy):");
			checkIn = sdf.parse(sc.next());
	
			System.out.println("Check-out date (dd/MM/yyyy):");
			checkOut = sdf.parse(sc.next());
	
			// a data da atualização n pode ser anteriores a data atual.
	
			/*
			 * Date now = new Date(); // cria uma data com horário de agr.
			 * 
			 * if (checkIn.before(now) || checkOut.before(now)) { // se a data de checkIn
			 * for antes de agora. System.out.
			 * println("Error in reservation: Reservation dates for update must be future dates"
			 * ); } else if (!checkOut.after(checkIn)) { System.out.
			 * println("Error in reservation: Check-out date must be after check-in date");
			 */
	
			// String error = reservation.updateDates(checkIn, checkOut);
	
			// if(error!=null) {
			// System.out.println("Error in reservation: "+error);
	
			// }
			// else {
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

		 }
          catch(ParseException e) {
        	  System.out.println("Invalid date format");
          }
		// }
           catch (DomainException e) { // se eu tirar , o programa vai quebrar, dando uma msg padrão, mesmo sendo uma runtimeexcepcions.
           //(IllegalArgumentException e) {
        	  System.out.println("Error in reservation: "+e.getMessage());  // a msg que passou na hora de instanciar a exceção.
           }
		catch(RuntimeException e) { // para qualquer exceção inesperada.
			System.out.println("Unexpected error"); // erro inesperada.
		}
		sc.close();
	}

}
