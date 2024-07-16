package jenkinsprojectnew;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsParameterTest {
	
	@Test
	public void recieveParameter()
	{
		String browserName = System.getProperty("browser");
		Reporter.log(browserName,true);
	}

}
