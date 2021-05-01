package main;

import manager.StudentManager;
import manager.UserManager;
import model.Instructor;
import model.Student;

public class Main {

	public static void main(String[] args) 
	{
		Student ogrenci = new Student("�merci�im", "Ceyhan");
		Instructor ogretmen = new Instructor("�mer", "Ceyhan","Developer");
		
		UserManager userManager = new UserManager();
		userManager.adSoyadYazd�r(ogrenci);
		userManager.adSoyadYazd�r(ogretmen);
		
		StudentManager studentManager = new StudentManager();
		studentManager.numaraAta(ogrenci, 1);
		
		
	}
	

}
