package manager;

import model.Student;

public class StudentManager 
{
	public void numaraAta(Student ogrenci, int ogrenciNumarasi) 
	{
		ogrenci.setNumara(ogrenciNumarasi);
		System.out.println(ogrenci.getAd() + " " + ogrenci.getSoyad() + 
				"' ýn öðrenci numarasý: " + ogrenciNumarasi + 
				" olarak atandý.");
	}
	
}
