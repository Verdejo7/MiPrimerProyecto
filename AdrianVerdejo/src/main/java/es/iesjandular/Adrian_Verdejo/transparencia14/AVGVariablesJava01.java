package es.iesjandular.Adrian_Verdejo.transparencia14;
import java.util.Scanner;
public class AVGVariablesJava01 {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int x=144,y=999,suma, resta, multiplicacion,division;
		String nombre="Adrian Verdejo Garcia";
		
		suma=x+y;
		resta=y-x;
		multiplicacion=y*x;
		division=y/x;
		
		System.out.println(x+" + "+y+" = "+suma
				+"\n"+y+" - "+x+" = "+resta
				+"\n"+y+" * "+x+" = "+multiplicacion
				+"\n"+y+" / "+x+" = "+division
				);
		
		System.out.println(nombre);
	}

}
