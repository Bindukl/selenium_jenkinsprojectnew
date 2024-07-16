package jenkinsprojectnew;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SecondProjectTest {
	
	@Test
	public void build()
	{
		Reporter.log("Execute the bulid successfully",true);
	}

}
