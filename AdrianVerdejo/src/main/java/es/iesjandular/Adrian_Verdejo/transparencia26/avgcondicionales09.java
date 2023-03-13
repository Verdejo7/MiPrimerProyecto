package es.iesjandular.Adrian_Verdejo.transparencia26;
import java.util.Scanner;
public class avgcondicionales09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,primerNumero=0;
		
		System.out.println("Introduce un numero pudiendo hasta 5 cifras");
		n=sc.nextInt();
		
		if (n<10) {
		      primerNumero=n;
		    }
		if ((n>=10)&&(n<100)){
		      primerNumero=n/10;
		    }
		if ((n>=100)&&(n<1000)){
		      primerNumero=n/100;
		    }
		if ((n>=1000)&&(n<10000)){
		      primerNumero=n/1000;
		    }
		if (n>=10000){
		      primerNumero=n/10000;
		    }
		    System.out.println("La primera cifra del numero introducido es el " + primerNumero + ".");
		    sc.close();
	}

}
