package jenkinsprojectnew;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ThirdProjectTest {
	
	@Test
	public void buildThree()
	{
		Reporter.log("Our third Build successfully lunched",true);
	}

}
