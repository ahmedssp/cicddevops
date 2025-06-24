import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.pag1;
;

public class test extends base{
    @Test
    public void case1(){
        paginsc.enterSearchText("car");
        paginsc.submitSearch();
        paginsc.acceptCookiesIfPresent();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(1,1);
    }
}
