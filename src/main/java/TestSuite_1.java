import org.junit.*;

public class TestSuite_1 {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("This is before class method");
    }

    @Before
    public void before(){
        System.out.println("This is before method");
    }

    @Test
    public void test1(){
        System.out.println("This is test 1");
    }

    @Test
    public void test2(){
        System.out.println("This is test 2");
    }

    @After
    public void after(){
        System.out.println("This is after method");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("This is after class method");
    }

}
