package es.iesjandular.Adrian_Verdejo.transparencia27;
import java.util.Scanner;
public class AVGBuclesMientras02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero,numeroAdivinar;
		
		 int numeroIntroducir,numeroAleatorio;
	        numeroAleatorio=(int) (Math.random()*10+1);

	        do{
	            System.out.println("Introduce numero");
	            numeroIntroducir=sc.nextInt();

	            if(numeroIntroducir>numeroAleatorio) {
	                System.out.println("Menos");
	            }else if(numeroIntroducir<numeroAleatorio) {
	                System.out.println("Mas");
	            }
	        }while(numeroIntroducir!=numeroAleatorio);{
	            System.out.println("Has acertado el numero");
	        }
	        sc.close();
	}

}