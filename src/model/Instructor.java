package model;

public class Instructor extends User
{
	private String uzmanlikAlani;
		
	public Instructor() 
	{
		super();
	}

	public Instructor(String ad, String soyad, String uzmanlikAlani) //constructor
	{
		super(ad, soyad);
		this.uzmanlikAlani = uzmanlikAlani;
	}
	

	public String getUzmanlikAlani() 
	{
		return uzmanlikAlani;
	}

	public void setUzmanlikAlani(String uzmanlikAlani) 
	{
		this.uzmanlikAlani = uzmanlikAlani;
	}
	
	
}
