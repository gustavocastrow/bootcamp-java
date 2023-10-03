package entities;

public class Student {
	
	public String name;
	public double grade1; //30
	public double grade2; //35
	public double grade3; //35
	
	public double finalGrade() {
		return (grade1 * 0.30) + (grade2 * 0.35) + (grade3 * 0.35);
	}
	
	
	public double missingPoints() {
		if(finalGrade() < 6) {
			return 6 - finalGrade();
		} else {
			return 0.0;
		}
	}
	
	public void status() {
		if(finalGrade() < 6) {
			System.out.printf("REPROVADO, sua média final foi: %.2f", finalGrade());
			System.out.println();
			System.out.printf("Faltaram %.2f PONTOS%n", missingPoints());
		} else {
			System.out.printf("APROVADO, sua média final foi: %.2f", finalGrade());
		}
		
	}

}
