import common.CommonLibraries;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.cs.A;

public class Hooks  extends CommonLibraries {

    @Before
    public void beforeMethod(){
openBrowser();

    }

    @After
    public void afterMethod(){

closeBrowser();

    }
}
