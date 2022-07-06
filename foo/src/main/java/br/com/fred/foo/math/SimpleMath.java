package br.com.fred.foo.math;

import org.springframework.stereotype.Service;

@Service
public class SimpleMath {

	public Double raiz(double number) {
		return (Double) Math.sqrt(number);
	}
	
	public Double soma(Double numberOne, Double numberTwo) {
		return numberOne + numberTwo;
	}
	
	public Double subtracao(Double numberOne, Double numberTwo) {
		return numberOne - numberTwo;
	}
	
	public Double divisao(Double numberOne, Double numberTwo) {
		return numberOne / numberTwo;
	}
	
	public Double multiplicacao(Double numberOne, Double numberTwo) {
		return numberOne * numberTwo;
	}
	
	public Double media(Double numberOne, Double numberTwo) {
		return (numberOne + numberTwo) / 2;
	}
	
}
