import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class ProyectoTest {
	private Proyecto func;
	private int resultint;
	private String resultString;
	private boolean resultBoolean;

	@Before
	public void createFunciones()
	{
		func=new Proyecto();
	}
	
	@After
	public void zeroFunciones()
	{
		func=null;
	}
	@Test
	public void Cadenas()
	{
		String cadena1 ="Buen";
		String cadena2 =" Martes";
		resultString=func.Cadenas(cadena1, cadena2);
		Assert.assertEquals(cadena1+cadena2, resultString);
	}
	
	@Test
	public void mayusculas()
	{
		String cadena="buenos dias";
		resultString=func.mayusculas(cadena);
		Assert.assertEquals("BUENOS DIAS", resultString);
		
	}
	
	@Test
	public void elementos()
	{
		String cadena="Monitor";
		resultint=func.elementos(cadena);
		Assert.assertEquals(7, resultint);
		
	}
	
	@Test
	public void numMayor()
	{
		int num1=7;
		int num2=2;
		resultBoolean=func.numMayor(num1, num2);
		Assert.assertEquals(true, resultBoolean);
		
	}
	
	@Test
	public void cuadrado()
	{
		int num=3;
		resultint=func.cuadrado(num);
		Assert.assertEquals(3*3, resultint);
		
	}
}