import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSuite_1 {

    @Before
    public void before(){
        System.out.println("This is before method");
    }

    @Test
    public void test1(){
        System.out.println("This is test 1");
    }

    @After
    public void after(){
        System.out.println("This is after method");
    }

}
