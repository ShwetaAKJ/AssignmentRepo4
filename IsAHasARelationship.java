public class IsAHasARelationship {
    public static void main(String[] args) {
        Car c=new Car(); //Has a relationship.
        c.show();

        Altroz al=new Altroz();//child calling parent method, is-a relationship , Parent->child
        al.show();
    }
}
class Car
{
    public void show()
    {
        System.out.println("Hello I am car.");
    }
}
class Altroz extends Car
{

}

