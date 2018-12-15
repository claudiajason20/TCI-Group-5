import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class crawlerTest {
    Crawler crawler=new Crawler();

    /**
     * THis test verifies whetehr the verifyUrl returns the correct value
     */
    @Test
    public void verifyThatUrlIsValidBeforeAddedToUrlQueue(){
        //arrange
        boolean validUrl;
        String url="https://www.geeksforgeeks.org/check-if-url-is-valid-or-not-in-java/";
        //act
        validUrl=crawler.verifyUrl(url);
        //assertion is done by the exception
        assertTrue(validUrl);
    }
    @Test
    public void verifyThatVerifyUrlMethodRuns(){
        String url="https://www.geeksforgeeks.org/check-if-url-is-valid-or-not-in-java/";

        Crawler spyCrawl= Mockito.spy(crawler);
        spyCrawl.verifyUrl(url);
        verify(spyCrawl).verifyUrl(url);
    }
}