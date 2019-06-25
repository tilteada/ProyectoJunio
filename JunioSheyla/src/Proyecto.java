public class Proyecto {
	public String  Cadenas(String cadena1, String cadena2) 
	{
		return cadena1+cadena2;
	}
	
	public String mayusculas(String cadena)
	{
		return cadena.toUpperCase();
	}
	
	public int elementos(String cadena)
	{
		return cadena.length();
	}
	
	public boolean numMayor(int num1, int num2)
	{
		if (num1>=num2) return true;
		else return false;
	}
	
	public int cuadrado(int num)
	{
		return num*num;
	}
	
	public boolean mayorDiez(int num)
	{
		if (num>10) return true;
		else return false;
	}

}