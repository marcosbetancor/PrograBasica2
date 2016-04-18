package ar.edu.unlam.programacionbasica2;

import org.junit.Test;

import static org.junit.Assert.*;

public class CuentaTest {
	
	@Test
	public void testCrearCuentaVacia(){
		Cuenta cuentavacia = new Cuenta();
		
		//OPCION 1
		Double expected = new Double(0.0);
		assertEquals(expected, cuentavacia.consultarSaldo());
		//Opcion 2
		assertEquals(new Double(0.0), cuentavacia.consultarSaldo());
			
	}
	
	@Test
	public void testCrearCuentaConSaldoInicial(){
		Cuenta cuentaconsaldo = new Cuenta(1, 500.0);
		
		//OPCION 1
		Double expected = new Double(500.0);
		assertEquals(expected, cuentaconsaldo.consultarSaldo());
		//Opcion 2
		assertEquals(new Double(500.0), cuentaconsaldo.consultarSaldo());
			
	}
	
	
	@Test
	
	public void ingresarDineroALaCuenta(){

		Cuenta cuentavacia= new Cuenta();
		cuentavacia.depositarDinero(50.0);
		assertEquals(new Double(50.00),cuentavacia.getSaldo());
	
	}
	
	@Test
	public void retirarDineroALaCuenta(){

		Double dineroAExtraer = new Double(100.0), dineroExtraido;
		Cuenta cuentaAExtraer = new Cuenta(0,dineroAExtraer);
		
		dineroExtraido = cuentaAExtraer.retirarDinero(dineroAExtraer);
		
		assertEquals(dineroAExtraer, dineroExtraido);
		assertEquals(new Double(100.00), cuentaAExtraer.consultarSaldo());
		

	}

	@Test
	
	public void consultarSaldo(){
		
		Cuenta cuentaconsaldo = new Cuenta(3,(double) 5434);
		
		assertEquals(5434, cuentaconsaldo.getSaldo(), 0.01);
		
	}
	

}