import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

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


    @Rule
    public TestRule listen = new TestWatcher(){

        @Override
        public void failed(Throwable t, Description description){
            System.out.println("Test "+description.getMethodName()+" failed");
        }

        @Override
        public void succeeded(Description description){
            System.out.println("Test "+description.getMethodName()+ " passed");
        }

    };

}
