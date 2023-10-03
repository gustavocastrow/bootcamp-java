package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Nome: ");
		student.name = sc.nextLine();
		
		System.out.println("Nota PRIMEIRO trimestre: ");
		student.grade1 = sc.nextDouble();
		
		System.out.println("Nota SEGUNDO trimestre: ");
		student.grade2 = sc.nextDouble();
		
		System.out.println("Nota TERCEIRO trimestre: ");
		student.grade3 = sc.nextDouble();
		
		student.status();
		
		
		
		sc.close();
		
	}

}
