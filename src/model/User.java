package model;

public class User 
{
	private String ad;
	private String soyad;
	

	public User() 
	{
		super();
	}


	public User(String ad, String soyad) 
	{
		super();
		this.ad = ad;
		this.soyad = soyad;
	}
	
	
	public String getAd() 
	{
		return ad;
	}
	public void setAd(String ad) 
	{
		this.ad = ad;
	}
	public String getSoyad() 
	{
		return soyad;
	}
	public void setSoyad(String soyad) 
	{
		this.soyad = soyad;
	}	
}
