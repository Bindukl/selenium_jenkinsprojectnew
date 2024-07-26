package jenkinsprojectnew;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewDemoProjectTest {
	
	@Test
	public void execute()
	{
		Reporter.log("Jenkins class executed  second time successfully",true);
		Reporter.log("Jenkins class executed  fourth time successfully",true);
	}

}
