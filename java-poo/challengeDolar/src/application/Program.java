package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o preço do dólar?: ");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("Quantos dólares serão comprados?: ");
		double amount = sc.nextDouble();
		
		double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
		System.out.printf("Valor a ser pago em reias = %.2f%n", result);
		
		sc.close();
		
	}

}
