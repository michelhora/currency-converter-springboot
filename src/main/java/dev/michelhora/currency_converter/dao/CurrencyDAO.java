package dev.michelhora.currency_converter.dao;

import org.springframework.stereotype.Repository;

import dev.michelhora.currency_converter.model.CurrencyConverter;

@Repository
public class CurrencyDAO {
	
	
	
	public double converter(CurrencyConverter actCurrency) {
	   double value =  actCurrency.getDolar() * actCurrency.getReal();
	   
	   return value;
	}
}
