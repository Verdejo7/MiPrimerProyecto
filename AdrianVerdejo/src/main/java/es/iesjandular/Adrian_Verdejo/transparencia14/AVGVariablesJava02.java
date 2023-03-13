package es.iesjandular.Adrian_Verdejo.transparencia14;
import java.util.Scanner;
public class AVGVariablesJava02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double euro, peseta=166.386 , conversion;
		
		System.out.println("Introduce los euros que quieres convertir a pesetas:");
		euro=sc.nextDouble();
		
		conversion=euro*peseta;
		
		System.out.println(euro+" euros en pesetas son: "+peseta);

	}

}
