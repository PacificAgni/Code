import java.util.*;
class Alarm{
    String message;
    boolean active=false;
    
    Alarm(String msg)
    {
     this.message=msg;
     this.active=true;
    }
    public void togglealarm()
    {
        if(this.active=true)
                this.active=false;
        else
                this.active=true;
    }
    public void Visualise()
    {
        System.out.println("This Alarm is a "+this.message+" and its present status is "+this.active);
    }
    
}
class PluralAssigment1{
    public static void main (String[] args) {
        Alarm alarm1=new Alarm("Fire Alarm");
        Alarm alarm2=new Alarm("Snooze Alarm");
        System.out.println("Message:- "+alarm1.message);
        System.out.println("Active Status:- "+alarm1.active);
        alarm1.togglealarm();
        System.out.println("Active status after toggle:-"+alarm1.active);
        alarm1.Visualise();
        
        System.out.println("Message:- "+alarm2.message);
        System.out.println("Active Status:- "+alarm2.active);
        alarm2.Visualise();
    }
    
}
