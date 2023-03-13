package es.iesjandular.Adrian_Verdejo.transparencia10;
import java.util.Scanner;
public class AVGPrimerosPasosJava11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1,nota2,notaFinal;
		
		 System.out.print("Introduzca la nota del primer examen: ");
		    nota1=sc.nextDouble();

		    System.out.print("¿Que nota quiere sacar en el trimestre? ");
		    notaFinal=sc.nextDouble();
		    
		    
		    nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60;
		    
		    System.out.println("Para tener un " + notaFinal + " en el trimestre");
		    System.out.println(" necesita sacar un " + nota2 + " en el segundo examen.");

	}

}
