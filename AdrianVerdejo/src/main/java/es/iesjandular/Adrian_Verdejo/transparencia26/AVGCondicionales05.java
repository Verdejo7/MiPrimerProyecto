package es.iesjandular.Adrian_Verdejo.transparencia26;
import java.util.Scanner;
public class AVGCondicionales05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int hora=24, min=00,hora1,min1;
		int resultado;
		
		System.out.println("Introduce tu hora");
		hora1=sc.nextInt();
		System.out.println("Introduce tus minutos");
		min1=sc.nextInt();
		
		System.out.print(resultado=hora-hora1);
		System.out.print(resultado=min-min1);
	}

}
