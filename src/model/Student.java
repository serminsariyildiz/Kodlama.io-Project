package model;

public class Student extends User
{
	private int numara;
	
	public Student() 
	{
		super();
	}
	
	public Student(String ad, String soyad) //constructor
	{
		super(ad, soyad);
	}
	
	
	public int getNumara() 
	{
		return numara;
	}
	public void setNumara(int numara) 
	{
		this.numara = numara;
	}
	
}
