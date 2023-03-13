package es.iesjandular.Adrian_Verdejo.transparencia26;
import java.util.Scanner;
public class AVGCondicionales02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Introduce la hora");
		hora=sc.nextInt();
		
		if(hora>=6 || hora<=12) {
			System.out.println("Buenos Dias");
		}else if(hora>=13 || hora<=20) {
			System.out.println("Buenas Tardes");
		}else if(hora>=21 || hora<=5) {
			System.out.println("Buenas Noches");
		}

	}

}
