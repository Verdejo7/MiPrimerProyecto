package es.iesjandular.Adrian_Verdejo.transparencia26;
import java.util.Scanner;
public class avgcondicionales07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int num;
		 
		 System.out.println("Introduce un numero para saber si es par y divisible entre 5");
		 num=sc.nextInt();
		 
		 if(num%2==0) {
			System.out.println("Es par");
		 }else {
			System.out.println("Es impar");
		 }
		 if(num%5==0 || num%5==5) {
			System.out.println("Es divisible entre 5");
		}else {
			System.out.println("No es divisible entre 5");
		}
		sc.close();
		 

	}

}
