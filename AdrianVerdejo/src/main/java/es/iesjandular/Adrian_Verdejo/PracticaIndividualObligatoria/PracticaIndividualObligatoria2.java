package es.iesjandular.Adrian_Verdejo.PracticaIndividualObligatoria;
import java.util.Scanner;
public class PracticaIndividualObligatoria2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contraseña;
		
		System.out.println("Introduce contraseña");
		contraseña=sc.nextInt();
		boolean encontrado=false;
		
		while(encontrado==false) {
			if(contraseña<600) {
				if(contraseña%13==0 && contraseña%2==0) {
					if(contraseña%7==0 && contraseña%3==0) {
						encontrado=true;
					}
				}
			}
			if(encontrado==false) {
				System.out.println(contraseña);
			}
		}
		
		System.out.println("Encontraste la contraseña: "+contraseña);
	}

}
