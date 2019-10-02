package testngexample;



public class example1 {
	@Test
	public void m1()
	{
		webdriver driver=new chromedriver();
		driver.get("https://www.google.co.in/");
		driver.navigate().to("https://www.facebook.com/");
	}

}
