public class CheckStaticMethodOverride {
    public static void main(String[] args) {

        BBB.test();
        //it is possible that static method override.
    }
}
class AAA
{
    protected static void test()
    {
        System.out.println("hello static method.");
    }
}
class BBB extends AAA
{
    public static void test()
    {
        System.out.println("hello method test from BBB");
    }
}

