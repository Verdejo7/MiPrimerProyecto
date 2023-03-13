package es.iesjandular.Adrian_Verdejo.transparencia9;
import java.util.Scanner;
public class AVGPrimerosPasosJava08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y,resultado=0,suma,resta,multiplicacion,division,resto,potencia,raiz,raiz1;
		
		System.out.println("Introduce el primer numero");
		x=sc.nextInt();
		
		System.out.println("Introduce el segundo numero");
		y=sc.nextInt();
		
		suma=x+y;
		System.out.println("La suma de los numeros "+x+" + "+y+" resultado "+suma);
		
		resta=x-y;
		System.out.println("La resta de los numeros "+x+" - "+y+" resultado "+resta);
		
		multiplicacion=x*y;
		System.out.println("La multiplicacion de los numeros "+x+" * "+y+" resultado "+multiplicacion);
		
		division=x/y;
		resto=x%y;
		System.out.println("La division de los numeros "+x+" y "+y+" resultado "+division+","+resto);
		
		potencia=(int) Math.pow(x, y);
		System.out.println("La potencia de los numeros "+x+" y "+y+" resultado "+potencia);
		
		raiz=(int) Math.sqrt(x);
		raiz1=(int) Math.sqrt(y);
		System.out.println("Raiz cuadrada de "+x+" es "+raiz+" y la raiz cuadrada de "+y+" es "+raiz1);
	}
}
