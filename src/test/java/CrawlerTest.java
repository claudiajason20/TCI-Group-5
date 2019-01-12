import org.junit.Test;

import static org.junit.Assert.*;

public class CrawlerTest {
    /**
     * This test is used to verify whether the verifyUrl method runs and returns the correct value
     */
    @Test
    public void AssertThatReceivedStringUrlIsValid(){
        //Arrange
        String url = "http://localhost/sample_sit/";
        Crawler a=new Crawler();
        boolean status;
        //Act
        status=a.verifyUrl(url);
        //Assert
        assertTrue("Url is valid!",status);
    }
}