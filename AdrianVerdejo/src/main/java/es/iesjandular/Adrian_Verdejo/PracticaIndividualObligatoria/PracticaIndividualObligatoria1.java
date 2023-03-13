package es.iesjandular.Adrian_Verdejo.PracticaIndividualObligatoria;
import java.util.Scanner;
public class PracticaIndividualObligatoria1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Introduce a");
		a=sc.nextInt();
		System.out.println("Introduce b");
		b=sc.nextInt();
		System.out.println("Introduce c");
		c=sc.nextInt();
		
		if(a>0 && a<=150 && a%13==0 && a%11==0) {
			System.out.println("Tesoro 1 encontrado");
		}else{
			if(a<=100 && (b<=20 || b==c)) {
				System.out.println("Tesoro 2 encontrado");//4
			}else {
				if(c>0 && c<=1500 && c%7==0 && c%13==0 && c%17==0) {
					System.out.println("Tesoro 3 encontrado");
				}
			}
			
		}
	}

}
