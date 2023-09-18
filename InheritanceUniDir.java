public class InheritanceUniDir {
    public void print()
    {
        System.out.println("hello form parent");
    }
}
class ChildClass extends InheritanceUniDir
{
    public void display()
    {
        System.out.println("hello from child");
    }

    public static void main(String[] args) {
        ChildClass ch=new ChildClass();
        InheritanceUniDir in=new InheritanceUniDir();
       // in.display();-----parent can not call the child's method -----child can call parent's method.
        ch.print(); //here child's obj can call parent's method , so it is unidirectional ...

    }
}