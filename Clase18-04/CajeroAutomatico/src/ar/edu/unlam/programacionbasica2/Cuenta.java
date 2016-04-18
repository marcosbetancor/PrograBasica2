package ar.edu.unlam.programacionbasica2;

public class Cuenta {
	private int numerocuenta;
	private float saldo;
	
public Cuenta (){
	
}
	
public Cuenta (int numerocuenta, float saldo){
	this.numerocuenta = numerocuenta;
	this.saldo = saldo;
	
}
	
public void setSaldo(float saldo){
	if( saldo >= 0)
		this.saldo = saldo;
	}

public float getSaldo(){
	return this.saldo;
	}

public void setNumeroCuenta(int numerocuenta){
	this.numerocuenta = numerocuenta;
	
}

public int getNumeroCuenta(){
	return this.numerocuenta;
}

public void depositarDinero(float deposito){
	this.saldo += deposito;
}

public void retirarDinero(float deposito){
	this.saldo -= deposito;
}



}