import org.junit.*;

public class TestRules {

    @Rule
    public Retry retry = new Retry(3);

    @BeforeClass
    public static void beforeClass(){
        System.out.println("This is before class method");
    }

    @Before
    public void before(){
        System.out.println("This is before method");
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
