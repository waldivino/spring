package br.com.fred.foo.converters;

public class NumberConverter {

	public static Double convertToDouble(String numero) {
		if(numero == null) return 0D;
		String number = numero.replace(",", ".");
		if(isNumeric(numero)) return Double.parseDouble(number);
		return 0D;
	}

	public static boolean isNumeric(String numero) {
		if(numero == null) return false;
		String number = numero.replace(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	
}
