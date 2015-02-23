package loop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Support {
	FirefoxDriver fD;
	Support (FirefoxDriver x)
	{
		fD=x;
	}
	
	
	void menuCollection() //throws InterruptedException
	{
	
		WebElement El=fD.findElementByXPath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/a");
		Actions  Ac=new Actions(fD);
		Ac.moveToElement(El).perform();
		int s=fD.findElements(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li")).size();
		System.out.println(s);
		//int s1=fD.findElements(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/div/div[1}/ul/li")).size();
		//System.out.println(s1);

	for(int i=1;i<s+1;i++)
	{
		
		WebElement E2=fD.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li["+i+"]"));
		
	
		Ac.moveToElement(E2).perform();
		//Thread.sleep(2000);
		
		//WebElement E2=fD.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li["+i+"]/a"));
		//Ac.moveToElement(E2).perform();
		
	}	
		/*for(int j=1;i<s1;j++)
		{
			
			fD.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/div/div[1]/ul/li["+j+"]/a")).click();
			Ac.moveToElement(E2).perform();
		}
		//Ac.moveToElement(El).perform();
		}*/
		}
	
	}

