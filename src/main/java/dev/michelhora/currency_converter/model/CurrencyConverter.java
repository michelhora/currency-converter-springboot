package dev.michelhora.currency_converter.model;

public class CurrencyConverter {
	private double dolar;
	private double real;
	
	public CurrencyConverter() {
		
	}
	
	public CurrencyConverter(double dolar, double real) {
		super();
		this.dolar = dolar;
		this.real = real;
	}

	public double getDolar() {
		return dolar;
	}

	public void setDolar(double dolar) {
		this.dolar = dolar;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	@Override
	public String toString() {
		return "CurrencyConverter [dolar=" + dolar + ", real=" + real + "]";
	}
}
