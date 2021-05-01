package manager;

import model.User;

public class UserManager 
{
	public void adSoyadYazdýr(User kullanici)
	{
		System.out.println("Adý:" + kullanici.getAd() + 
				" Soyadý:" + kullanici.getSoyad());
	}
	
	
}
