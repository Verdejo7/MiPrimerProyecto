package es.iesjandular.Adrian_Verdejo.transparencia45;
import java.util.Scanner;
public class AVGBuclesHastaQue05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Introduce numero");
		numero=sc.nextInt();
		
		for(int fila = 1; fila <= numero; fila++) {
			for(int columna = fila; columna <= numero; columna++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}

}
