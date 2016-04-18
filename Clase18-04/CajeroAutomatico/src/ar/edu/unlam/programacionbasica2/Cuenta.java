package ar.edu.unlam.programacionbasica2;

public class Cuenta {
	private Integer numerocuenta;
	private Double saldo;

	public Cuenta (){
		this.numerocuenta = 0;
		this.saldo = 0.0;
		
	}
		
	
public Cuenta (Integer numerocuenta, Double saldo){
	this.numerocuenta = numerocuenta;
	this.saldo = saldo;
	
}
	

public Double getSaldo(){
	return this.saldo;
}

public Integer getNumeroCuenta(){
	return this.numerocuenta;
}

public void depositarDinero(Double deposito){
	this.saldo += deposito;
}

public Double retirarDinero(Double deposito){
	if(this.saldo >= deposito){
		this.saldo -= deposito;
	} 
	
	return saldo;
}

public Double consultarSaldo(){
	return (getSaldo());
	
}


}