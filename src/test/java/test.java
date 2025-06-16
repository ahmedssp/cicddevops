import org.testng.annotations.Test;
import pages.pag1;
;

public class test extends base{
    @Test
    public void case1(){
        paginsc.enterSearchText("car");
        paginsc.submitSearch();
        paginsc.acceptCookiesIfPresent();
    }
}
