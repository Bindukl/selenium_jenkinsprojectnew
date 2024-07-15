package jenkinsprojectnew;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewDemoProjectTest {
	
	@Test
	public void execute()
	{
		Reporter.log("Jenkins class executed  second time successfully",true);
	}

}
