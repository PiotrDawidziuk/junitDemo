import org.junit.*;

public class TestSuite_1 extends TestRules {


    @Test
    public void test1(){
        System.out.println("This is test 1 from TestSuite_1");
        Assert.assertTrue(false);
    }


    @Test
    public void test2(){
        System.out.println("This is test 2 from TestSuite_1");
    }

}
