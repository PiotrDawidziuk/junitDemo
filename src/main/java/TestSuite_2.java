import org.junit.*;

public class TestSuite_2 {


    @BeforeClass
    public static void beforeClass(){
        System.out.println("This is before class method from TestSuite_2");
    }

    @Before
    public void before(){
        System.out.println("This is before method from TestSuite_2");
    }

    @Test
    public void test1(){
        System.out.println("This is test 1 from TestSuite_2");
    }

    @Test
    public void test2(){
        System.out.println("This is test 2 from TestSuite_2");
    }

    @After
    public void after(){
        System.out.println("This is after method from TestSuite_2");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("This is after class method from TestSuite_2");
    }

}
