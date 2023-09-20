public class ThisKeyword {
    String nm;
    ThisKeyword()
    {
        this("shw");    //here calling parametrized Constructor.
        System.out.println("default constructor");
    }
    ThisKeyword(String nm)
    {
        this.nm=nm; //here this keyword use for differentiate instance variable and local variable which has same variable name.
        System.out.println("nm=> param constructor "+ nm);
    }
    void test()
    {
        ThisKeyword key=new ThisKeyword();// in method we can call the constructor by creating class object.

    }

    public static void main(String[] args) {
        ThisKeyword key2=new ThisKeyword("shweta");
        System.out.println(key2.nm);
        key2.test();
    }
}
