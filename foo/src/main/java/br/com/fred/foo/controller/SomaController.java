package br.com.fred.foo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fred.foo.converters.NumberConverter;
import br.com.fred.foo.exception.UnsuportedMathOperationException;
import br.com.fred.foo.math.SimpleMath;

@RestController
public class SomaController {
	
	@Autowired
	SimpleMath simpleMath;
	
	@RequestMapping(value = "/soma/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double soma(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Favor defina um valor numérico! ");
		}
		
		Double soma = simpleMath.soma(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
		
		return soma;
	}
	
	@RequestMapping(value = "/subtracao/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double subtracao(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Favor defina um valor numérico! ");
		}
		
		Double subtracao = simpleMath.subtracao(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
		
		return subtracao;
	}
	
	@RequestMapping(value = "/divisao/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double divisao(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Favor defina um valor numérico! ");
		}
		
		Double divisao = simpleMath.divisao(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
		
		return divisao;
	}
	
	@RequestMapping(value = "/multiplicacao/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double multiplicacao(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Favor defina um valor numérico! ");
		}
		
		Double multiplicacao = simpleMath.multiplicacao(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
		
		return multiplicacao;
	}
	
	@RequestMapping(value = "/media/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double media(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Favor defina um valor numérico! ");
		}
		
		Double media = simpleMath.media(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
		
		return media;
	}
	
	@RequestMapping(value = "/raiz/{number}", method = RequestMethod.GET)
	public Double raiz(@PathVariable("number") String number) throws Exception {
		if(!NumberConverter.isNumeric(number)) {
			throw new UnsuportedMathOperationException("Favor defina um valor numérico! ");
		}
		
		Double raiz = simpleMath.raiz(NumberConverter.convertToDouble(number));
		
		return raiz;
	}
	
}
