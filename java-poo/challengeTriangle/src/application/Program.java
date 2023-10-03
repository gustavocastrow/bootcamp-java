package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Entre com a largura do retangulo: ");
		rectangle.width = sc.nextDouble();
		
		System.out.println("Entre com a altura do retangulo: ");
		rectangle.height = sc.nextDouble();
		
		//ÁREA:
		System.out.printf("AREA = %.2f%n", rectangle.area());
		
		//PERÍMETRO:
		System.out.printf("PERÍMETRO = %.2f%n", rectangle.perimeter());
		
		//DIAGONAL:
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
		
		
		

	}

}
