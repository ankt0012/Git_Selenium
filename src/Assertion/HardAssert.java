package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
    @Test
    public void demo() {
        String actualResult = "Qspider";
        String expectedResult = "Qspider";

        Assert.assertEquals(actualResult, expectedResult);
        System.out.println("Assertion  is passed");
    }

}
