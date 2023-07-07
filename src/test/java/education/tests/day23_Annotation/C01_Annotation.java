package education.tests.day23_Annotation;

import org.testng.annotations.*;

public class C01_Annotation {

    @BeforeSuite
    public void suit(){
        System.out.println("Her seyden once bir kez BeforeSuit calisir");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Her testten once bir kez calisir");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Her class@dan once bir kez calisir");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("Junitte ki @Before notasyonu gibi her methoddan once calisir");
    }

    @Test
    public void test01() {
        System.out.println("Test1 calisti");
    }

    @Test
    public void test2() {
        System.out.println("Test2 calisti");
    }

    @Test
    public void test03() {
        System.out.println("Test3 calisti");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("Her seyden sonra bir kez calisir");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Her testten sonra bir kez calisir");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Her class'dan sonra bir kez calisir");
    }

    @AfterMethod
    public  void afterMethod(){
        System.out.println("Juinit'teki @After notastonu gibi her method'dan sonra calisir");
    }





















}
