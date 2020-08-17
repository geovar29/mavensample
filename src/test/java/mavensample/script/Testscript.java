package mavensample.script;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Loginpage;
import testbase.Testbase;
import utils.Utils;

public class Testscript extends Testbase {
	
	Loginpage log;
	Utils ut;
	public Testscript() {
		super();
	}
	
	@BeforeTest
	public void setup() {
		inilisation();
		log=new Loginpage();
        ut=new Utils();	
	}
    @Test(priority=1)
    public void verifyusername() {
       log.validateusername("geovar29");
       
       
    }

    @Test(priority=2)
    public void validatepassword() throws IOException {
    	log.validatepassword("pass");
   for(int i=2;i<=10;i++) {
      ut.screenshot(driver, "screen"+i);
      break;
    }
   
    }
    
    
    
    

}
