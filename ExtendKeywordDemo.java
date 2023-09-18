public class ExtendKeywordDemo {
    public void test()
    {

    }
}
class Child extends ExtendKeywordDemo
{

}
class Main
{
    public static void main(String[] args) {
        Child ch=new Child();
        ch.test();
        ExtendKeywordDemo ex=new ExtendKeywordDemo();
        ex.test();
    }
}