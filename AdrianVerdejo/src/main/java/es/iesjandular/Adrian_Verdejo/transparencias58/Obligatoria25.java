package es.iesjandular.Adrian_Verdejo.transparencias58;


public class Obligatoria25 
{
	private static String code1 = ":@A=", code2 = ">;7<", code3 = "BC:@";
	
	public static void main(String[] args) 
	{
		//ypu carnot write any code here
		System.out.println();
	}

	/**
	 * Firstly, you have to decrypt every code
	 */
	public static void decrypter(String code)
	{
		for(int i=0 ; i < code.length();i++) 
		{
			char charDecrypted = (char) (code.charAt(i)-10);
			System.out.println(charDecrypted);
		}
	}
	public static void crackingCode(String decryptedCode)
	{
		//secretCode must be assigned to
		//descryptedCode.hashCode() to get
		//the secret code
		int secretCode = -1;
		
		if(secretCode == 1724615) 
		{
			System.out.println("Code Cracked!");
		}
	}
}
