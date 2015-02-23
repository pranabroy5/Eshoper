import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;



public class video {
	FirefoxDriver dr;	
	
	@Before
	public void before()
	{
		dr=new FirefoxDriver();
		dr.get("http://www.youtube.com");
	}

}
