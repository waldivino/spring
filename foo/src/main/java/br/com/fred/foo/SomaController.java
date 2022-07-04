package br.com.fred.foo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fred.foo.exception.UnsuportedMathOperationException;

@RestController
public class SomaController {
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Favor defina um valor numérico! ");
		}
		
		Double sum = convertToDouble(numberOne) + convertToDouble(numberTwo);
		
		return sum;
	}
	
	private Double convertToDouble(String numero) {
		if(numero == null) return 0D;
		String number = numero.replace(",", ".");
		if(isNumeric(numero)) return Double.parseDouble(number);
		return 0D;
	}

	private boolean isNumeric(String numero) {
		if(numero == null) return false;
		String number = numero.replace(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
