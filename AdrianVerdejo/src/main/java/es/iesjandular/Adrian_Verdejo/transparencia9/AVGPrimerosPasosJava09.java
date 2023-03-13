package es.iesjandular.Adrian_Verdejo.transparencia9;
import java.util.Scanner;
public class AVGPrimerosPasosJava09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double euro,peseta;
		
		System.out.println("Introduce los euros para saber las pesetas:");
		euro=sc.nextInt();
		
		peseta=euro*166.39;
		
		System.out.println("El resultado de "+euro+" son "+peseta+" pesetas");

	}

}
