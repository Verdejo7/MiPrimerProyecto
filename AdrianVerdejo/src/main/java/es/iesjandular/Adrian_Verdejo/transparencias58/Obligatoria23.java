package es.iesjandular.Adrian_Verdejo.transparencias58;


public class Obligatoria23 {

	public static void main(String[] args) 
	{
		String usuario="ninguno";
		String password="ninguna";
		
		boolean accesoSistema = false;
		
		if(usuario.equals("ninguno") && (password.equals("ninguna"))) 
		{
			accesoSistema=true;
			System.out.println("Acceso al sistema realizado");
		}else
		{
			System.out.println("Aviso al personal de vigilancia");
		}
		
		boolean accesoAlNumeroSecreto=false;
		
		if(accesoSistema) 
		{
			int numeroSecreto=10;
			if(numeroSecreto==20) 
			{
				accesoAlNumeroSecreto=true;

			}
		}
	}
	public static void aperturaDeCompuerta() 
	{
		System.out.println("Apertura de compuerta realizada");
	}

}