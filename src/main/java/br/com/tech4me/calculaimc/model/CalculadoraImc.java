package br.com.tech4me.calculaimc.model;

public class CalculadoraImc {
	private Double peso;
	private Double altura;
	private Double imc;

	
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getImc() {
		return imc;
	}
	
	public String getClassificacao() {
		if (imc < 18.5 ) {
			return "Magreza";
		}
		
		if (imc < 24.9) {
			return "Normal";
		}
		
		if (imc < 29.9) {
			return "Sobrepeso";
		}
		
		if (imc < 39.9) {
			return "Obesidade";
		}
	
		return "Obesidade grave";
	}
	
	
	public void calcular() {	
		Double valor = peso / (altura * altura); 
		this.imc = (double) Math.round(valor * 100d);
		this.imc = imc / 100;	
	}
	
	
	
	

}
