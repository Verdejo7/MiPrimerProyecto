package es.iesjandular.Adrian_Verdejo.transparencia26;
import java.util.Scanner;
public class AVGCondicionales06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Introduce un numero: ");
		a=sc.nextInt();
		
		System.out.println("Introduce otro numero: ");
		b=sc.nextInt();
		
		System.out.println("Introduce otro numero: ");
		c=sc.nextInt();
		
		if(a>b && b>c) {
			
			System.out.println("Mayor a menor: "+ a +" , "+ b +" , "+ c);
			
		}else if(a>b && c>b) {
			
			System.out.println("Mayor a menor: "+ a +" , "+ c +" , "+ b);
		
		}else if(b>a && c>a) {
			
			System.out.println("Mayor a menor: "+ b +" , "+ c +" , "+ a);
		
		}else if(b>a && a>c) {
			
			System.out.println("Mayor a menor: "+ b +" , "+ a +" , "+  c);
		
		}else if(c>b && b>a) {
			
			System.out.println("Mayor a menor: "+ c +" , "+ b +" , "+ a);
		
		}else{
			
			System.out.println("Mayor a menor: "+ c +" , "+ a +" , "+ b);
		}

	}

}
