import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.pag1;
import static org.testng.AssertJUnit.assertNotNull;

public class test extends base{
    @Test
    public void case1(){
        paginsc.enterSearchText("car");
        paginsc.submitSearch();
        paginsc.acceptCookiesIfPresent();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(1,1);
        String str = "Hello, World!";
        assertNotNull(str, "String should not be null");

    }
}
