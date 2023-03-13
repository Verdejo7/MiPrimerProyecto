package es.iesjandular.Adrian_Verdejo.transparencia27;
import java.util.Scanner;
public class AVGBuclesMientras01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		
		for(int i=0;i>=150;i++) {
			if(i>0 && i<=150 && i%13==0 && i%11==0) {
				a=i;
			}
		}
		System.out.println(a);
	}

}
