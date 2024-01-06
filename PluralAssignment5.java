import java.time.*;
class SnoozeAlarm{
    String message;
    private boolean active;
    private LocalDateTime snoozeuntill;
    private SnoozeAlarm(String message)
    {
        this.message=message;
        stopSnooozing();
    }
    void snooze(){
        if(active)
        snoozeuntill=LocalDateTime.now().plusSeconds(5);
    }
    boolean isSnoozing()
    {
        return snoozeuntill.isAfter(LocalDateTime.now());
    }
    void stopSnooozing()
    {
        snoozeuntill=LocalDateTime.now().minusSeconds(1);
    }
    String getMessage()
    {
        return message;
    }
    void turnOff(){
     active=false;   
     stopSnooozing();
     
    }
     
     void turnOn(){
     active=true;  
     stopSnooozing();
    } 
    String getReport(){
        return getReport(false);
    }
    String getReport(boolean uppercase)
    {
        if(active && !isSnoozing())
        {
            if(uppercase)
            return message.toUpperCase();
            else
            return message;
        }
        else 
        return " ";
    }
    void sendReport()
    {
        System.out.println(getReport(true));
    }

public static void main (String[] args) throws InterruptedException {
    SnoozeAlarm alarm=new SnoozeAlarm("Temperature Too High");
    alarm.turnOn();
    alarm.snooze();
    Thread.sleep(5000);
    alarm.sendReport();
}
}
