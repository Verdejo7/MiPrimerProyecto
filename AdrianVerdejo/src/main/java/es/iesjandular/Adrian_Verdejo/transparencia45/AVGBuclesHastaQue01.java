package es.iesjandular.Adrian_Verdejo.transparencia45;
import java.util.Scanner;
public class AVGBuclesHastaQue01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double factorial=1;
		int num;
		
		System.out.println("Introduzca numero");
		num=sc.nextInt();
		
		for(int i=num;i>0;i--) {
			factorial=factorial*i;
		}
		System.out.println("El resultado es: "+factorial);
	}

}
