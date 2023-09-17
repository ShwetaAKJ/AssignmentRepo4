public class MainClass {
    public static void main(String[] args){
        CC c1 = new CC();
        c1.test();
        //only class cc's method called.
    }
}
class AA
{
    void test(){}
}
class BB extends AA
{
    protected void test()
    {
        System.out.println("Hello class BB");
    }
}
class CC extends BB
{
    public void test()
    {
        System.out.println("Hello class CC");
    }
}
