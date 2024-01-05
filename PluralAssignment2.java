class Object{
    String name;
    int marks;
    public void Display()
    {
        System.out.print("Name= "+this.name+" Marks= "+this.marks);
    }
}
public class NullReferenceExample {
    public static void main(String[] args) {
        // Declaring a reference variable without initializing it
        Object myObject=new Object();

        // Assigning null to the reference variable
        myObject = null;
        System.out.println(myObject);

        }
}
