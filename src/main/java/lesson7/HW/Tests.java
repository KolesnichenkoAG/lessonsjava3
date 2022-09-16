package lesson7.HW;

public class Tests {

    @BeforeSuite
    public void BeforeSuite() {
        System.out.println("Test BeforeAll");
    }

    @Test(priority = 2)
    public void test1() {
        System.out.println("Test-1");
    }

    @Test(priority = 3)
    public void test2() {
        System.out.println("Test-2");
    }
    @Test(priority = 5)
    public void test3() {
        System.out.println("Test-3");
    }
    @Test(priority = 8)
    public void test4() {
        System.out.println("Test-4");
    }

    @AfterSuite
    public void testAfterAll() {
        System.out.println("Test AfterAll");
    }
//    @AfterSuite
//    public void testAfterAll2() {
//        System.out.println("Test AfterAll2");
//    }

}
