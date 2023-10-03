package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		//ler: nome - salário brito - imposto
		//mostar: nome - salario liquido 
		
		System.out.print("Nome: ");
		emp.name = sc.nextLine();
		
		System.out.print("Salário Bruto: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.print("Imposto: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Funcionário: " + emp);
		
		System.out.println("Qual a porcentagem para aumentar o salário?: ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println("Dados atualizados: " + emp);
		sc.close();
		
		
		
		
		
		

	}

}
