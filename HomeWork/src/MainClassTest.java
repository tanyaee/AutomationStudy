import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{

    @Test
    public void testGetLocalNumber(){
       // MainClass number = new MainClass();
        int actualNumber = this.getLocalNumber();
        Assert.assertTrue("Number != 14", actualNumber == 14);

    }

    @Test
    public void testGetClassNumber(){
        Assert.assertTrue("Returned number <= 45", this.getClassNumber() > 45);
    }

    @Test
    public void testGetClassString(){
        String testString = this.getClassString();

        Assert.assertTrue("Class string doesn't containd 'hello' or 'Hello' words", testString.contains("Hello") | testString.contains("hello"));
    }

}
