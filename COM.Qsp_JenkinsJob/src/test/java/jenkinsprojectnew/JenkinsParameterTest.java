package jenkinsprojectnew;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsParameterTest {
	
	@Test
	public void recieveParameter()
	{
		System.getProperty("browser");
		Reporter.log("browser Name",true);
	}

}
