import org.junit.*;

public class TestSuite_1 {

    @Rule
    public Retry retry = new Retry(3);

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
