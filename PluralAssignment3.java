class Alarm{
    String message;
    boolean active=false;
    public void visualise()
    {
        System.out.println("MESSAGE:= "+ this.message);
        System.out.println("STATUS:= "+ this.active);
    }
    Alarm(String msg)
    {
        this.message=msg;
    }
    
}
class PluralAssignment3{
    public static void main (String[] args) {
        //Non final primitive will be changed
        int a=10;
        System.out.println("Value of a="+a);
        a++;
        System.out.println("Value of a="+a);
        final int b=10;
        System.out.println("Value of b="+b);
        //b++;   will throw an exception
         Alarm alarm1=new Alarm("Alarm1");
         System.out.println(alarm1.message);
        alarm1=new Alarm("Alarm1 Updated");
        System.out.println(alarm1.message);
        
        
         final Alarm alarm2=new Alarm("Alarm2");
         System.out.println(alarm2.message);
        //alarm2=new Alarm("Alarm1 Updated"); will throw an error
        System.out.println(alarm2.active);
        alarm2.active=true;
        System.out.println(alarm2.active);// since only reference is constant not the object
        
        
        
        
    }
}
