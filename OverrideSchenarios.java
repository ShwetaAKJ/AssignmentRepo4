public class OverrideSchenarios {
    public static void main(String[] args) {
        C c=new C();
        B b=new B();
        A a=new A();

        a.test();
        b.test();
        c.test();
    }
}
class A
{
    protected void test()
    {
        System.out.println("hello test method of class A");
    }
}
class B extends A
{
    protected void test()
    {
        System.out.println("hello test method of class B");
    }

}
class C extends B
{
    protected void test()
    {
        System.out.println("hello test method of class C");
    }
}