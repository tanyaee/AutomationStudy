import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{

    @Test
    public void testGetLocalNumber(){
       // MainClass number = new MainClass();
        int actualNumber = this.getLocalNumber();
        Assert.assertTrue("Number != 14", actualNumber == 14);

    }
}
