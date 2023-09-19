package step_definitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import base.Base;



public class Hooks extends Base{
	@Before
	public void setup() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
		System.out.println("before run");
	}
	
	@After
	public void tearDown() {
//		driver.quit();
		System.out.println("after run");
	}
}
