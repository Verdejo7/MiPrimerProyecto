package es.iesjandular.Adrian_Verdejo.transparencia26;
import java.util.Scanner;
public class avgcondicionales10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduce un numero");
		num=sc.nextInt();
		
		if(num<10) {
			System.out.println("El numero tiene una cifra");
		}else if(num>=10 && num<100) {
			System.out.println("El numero tiene dos cifras");
		}else if(num>=100 && num<1000) {
			System.out.println("El numero tiene tres cifras");
		}else if(num>=1000 && num<10000) {
			System.out.println("El numero tiene cuatro cifras");
		}else if(num>=10000 && num<100000) {
			System.out.println("El numero tiene cinco cifras");
		}
		
		if(num<-10) {
			System.out.println("El numero tiene una cifra");
		}else if(num>=-10 && num<-100) {
			System.out.println("El numero tiene dos cifras");
		}else if(num>=-100 && num<-1000) {
			System.out.println("El numero tiene tres cifras");
		}else if(num>=-1000 && num<-10000) {
			System.out.println("El numero tiene cuatro cifras");
		}else if(num>=-10000 && num<-100000) {
			System.out.println("El numero tiene cinco cifras");
		}

	}

}
