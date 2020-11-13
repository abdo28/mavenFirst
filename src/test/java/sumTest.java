import org.junit.Assert;
import org.junit.Test;

public class sumTest {

    @Test
    public void testSum(){
        sum testService = new sum();
        Assert.assertEquals(3, testService.Sum(2, 1));
    }
}
