package ar.edu.unlam.programacionbasica2;

import org.junit.Test;

import static org.junit.Assert.*;

public class CuentaTest {
	
	@Test
	
	
	public void ingresarDineroALaCuenta(){

		Cuenta cuentavacia= new Cuenta(1,0);
		cuentavacia.depositarDinero(50);
		assertNotEquals(0,cuentavacia.getSaldo());
	
	}
	
	@Test
	public void retirarDineroALaCuenta(){

		Cuenta cuentaconsaldo = new Cuenta(2,500);
		
		cuentaconsaldo.retirarDinero(150);
		
		assertEquals(350,cuentaconsaldo.getSaldo(), 0.01);

	}

	@Test
	
	public void consultarSaldo(){
		
		Cuenta cuentaconsaldo = new Cuenta(3,5434);
		
		assertEquals(5434, cuentaconsaldo.getSaldo(), 0.01);
		
	}
	

}