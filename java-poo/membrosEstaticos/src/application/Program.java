package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter Radius: ");
		double radius = sc.nextDouble();
		
		Calculator calc = new Calculator();
		
		
		
		double c = calc.circumference(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI Value: %.2f%n", calc.PI);
		
		sc.close();
		
		
	}
	
}
