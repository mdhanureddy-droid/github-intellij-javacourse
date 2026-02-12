package coreJavaTraining;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG2 {


    @Test(priority = 1)
    void setup()
    {
        System.out.println("open browser");
    }
    @Test(priority = 2)
    void search ()
    {
        System.out.println("Search");
    }
    @Test(priority = 3)
    void addCustomer ()
    {

        System.out.println("addCustomer");
        Assert.assertEquals(1,1);
    }
}
