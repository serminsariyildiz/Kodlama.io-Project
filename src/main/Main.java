package main;

import manager.StudentManager;
import manager.UserManager;
import model.Instructor;
import model.Student;

public class Main {

	public static void main(String[] args) 
	{
		Student ogrenci = new Student("Öğrenci", "Soyadı");
		Instructor ogretmen = new Instructor("Öğretmen", "Soyadı","Developer");
		
		UserManager userManager = new UserManager();
		userManager.adSoyadYazdýr(ogrenci);
		userManager.adSoyadYazdýr(ogretmen);
		
		StudentManager studentManager = new StudentManager();
		studentManager.numaraAta(ogrenci, 1);
		
		
	}
	

}
