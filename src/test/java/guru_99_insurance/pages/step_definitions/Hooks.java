package guru_99_insurance.pages.step_definitions;

import guru_99_insurance.pages.util.Driver;
import guru_99_insurance.pages.util.PropertiesReadingUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void Setup(){
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(PropertiesReadingUtil.getProperties("environmentURL"));
    }

    @After
    public void TearDown(){
     //   Driver.closeDriver();


    }
}
