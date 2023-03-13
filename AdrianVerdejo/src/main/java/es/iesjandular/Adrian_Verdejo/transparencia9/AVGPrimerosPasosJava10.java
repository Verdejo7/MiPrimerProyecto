package es.iesjandular.Adrian_Verdejo.transparencia9;
import java.util.Scanner;
public class AVGPrimerosPasosJava10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int salario, semanal=1, hora, resultado;
		
		System.out.println("Introduce el salario");
		salario=sc.nextInt();
		
		System.out.println("Introduce el las horas");
		hora=sc.nextInt();
		
		resultado=salario*hora;
		
		System.out.println("Resultado de salario semanal "+resultado);

	}

}
