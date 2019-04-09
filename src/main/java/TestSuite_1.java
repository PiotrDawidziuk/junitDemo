import org.junit.*;

public class TestSuite_1 {

    @Rule
    public Retry retry = new Retry(3);



//    @BeforeClass
//    public static void beforeClass(){
//        System.out.println("This is before class method from TestSuite_1");
//    }

//    @Before
//    public void before(){
//        System.out.println("This is before method from TestSuite_1");
//    }

    @Test
    public void test1(){
        System.out.println("This is test 1 from TestSuite_1");
        Assert.assertTrue(false);
    }


    @Test
    public void test2(){
        System.out.println("This is test 2 from TestSuite_1");
    }

//    @After
//    public void after(){
//        System.out.println("This is after method from TestSuite_1");
//    }
//
//    @AfterClass
//    public static void afterClass(){
//        System.out.println("This is after class method from TestSuite_1");
//    }

}
