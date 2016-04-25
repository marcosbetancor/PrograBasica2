package ar.edu.unlam.basica2;

public class CuentaCorriente extends Cuenta {
	
	private Double sobregiro;
	
	public Double getSobregiro() {
		return sobregiro;
	}

	public void setSobregiro(Double sobregiro) {
		this.sobregiro = sobregiro;
	}

	public CuentaCorriente(Double sobregiro){
		this.sobregiro = sobregiro;
		
	}
	
	public Double extraerDinero(Double importeARetirar){
		Double importeRetirado = 0.0;
		
		if(importeARetirar<= super.getSaldo()){
			super.extraerDinero(importeARetirar);
			importeRetirado = importeARetirar;
		}
		else if(importeARetirar<= (super.getSaldo() + this.sobregiro)){
			this.sobregiro -= (importeARetirar - super.getSaldo());
			super.extraerDinero(super.getSaldo());
			importeRetirado = importeARetirar;
		
		} else {
			
			importeRetirado = 0.0;
			
			
		}
		
		return importeRetirado;
	}
	
}
