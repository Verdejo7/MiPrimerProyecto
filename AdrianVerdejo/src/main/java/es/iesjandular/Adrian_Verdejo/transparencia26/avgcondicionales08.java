package es.iesjandular.Adrian_Verdejo.transparencia26;
import java.util.Scanner;
public class avgcondicionales08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Por favor, introduzca un número entero: ");
	    n = sc.nextInt();
	    System.out.println("La última cifra del numero introducido es el " + (n % 10));
	    sc.close();
	}

}
