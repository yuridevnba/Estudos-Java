package entities;

import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas publicações vc irá fazer hj? ");
		int m = sc.nextInt();
		for (int l = 0; l < m; l++) {

			SimpleDateFormat date = new SimpleDateFormat("dd/mm/yyyy");

			System.out.println("-----------POST-----------------------------------");

			System.out.println("Título: ");
			String title = sc.nextLine();

			sc.nextLine();
			System.out.println("Moment: dd/mm/yyyy  HH:mm:ss  ");
			String moment = sc.next();

			Date tipodate = date.parse(moment);

			System.out.println("Content: ");
			String content = sc.nextLine();

			sc.nextLine();
			System.out.println("Likes: ");
			Integer likes = sc.nextInt();

			Post post  = new Post(tipodate, title, content, likes);

			sc.nextLine();
			System.out.println("Quantos comentários vc irá fazer? ");
			int n = sc.nextInt();
			
			
			System.out.println("-------------------- Publicação----------------------------------------------");
			System.out.println(post);
			
			
			

			for (int i = 0; i < n; i++) {

				sc.nextLine();
				System.out.println("Comentário" + (i + 1));
				String text = sc.nextLine();
				Comment comment = new Comment(text);
				post.addComment(comment);
				// comment.getText();
			}
			

			//System.out.println();
			//System.out.println("-------------------- Publicação----------------------------------------------");
			//System.out.println(post);
		}

		
	}

}
