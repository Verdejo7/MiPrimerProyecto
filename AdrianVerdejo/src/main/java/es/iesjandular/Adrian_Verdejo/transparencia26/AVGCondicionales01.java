package es.iesjandular.Adrian_Verdejo.transparencia26;
import java.util.Scanner;
public class AVGCondicionales01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Escribe 1: Lunes"
						  +"\nEscribe 2: Martes"
						  +"\nEscribe 3: Miercoles"
						  +"\nEscribe 4: Jueves"
						  +"\nEscribe 5: Viernes"
						  );
		n=sc.nextInt();
		
		if(n==1) {
			System.out.println("Bases de Datos, Programacion, Lenguajes de marcas, Entornos");
		}else if(n==2) {
			System.out.println("Programacion, Fol, Lenguajes de marcas, Sistemas Informaticos");
		}else if(n==3) {
			System.out.println("Sistemas Informaticos, Programacion, Lenguajes de marcas, Entornos");
		}else if(n==4) {
			System.out.println("Fol, Lenguajes de marcas, Bases de Datos, Sistemas Informaticos");
		}else if(n==5) {
			System.out.println("Programacion, Fol, Bases de Datos, Entornos");
		}
		

	}

}
