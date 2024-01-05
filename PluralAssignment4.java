class Alarm {
    boolean active;
    String message;
    Alarm(String msg)
    {
        this.message=msg;
    }
    public void turnon() {
        this.active=true;
    }
    public void turnOff() {
        this.active=false;
    }
    String getReport() {
        return getReport(false);
    }
    String getReport (boolean uppercase) {
        if (active) {
            if (uppercase)
            return message.toUpperCase();
            else
            return message;
            } else
                return "";
            }
    public void sendReport() {
        System.out.println(getReport(true));
        }
}
class PluralAssignment4{
    public static void main (String[] args) {
        Alarm alarm1=new Alarm("Alarm1");
        System.out.println(alarm1.message);
        alarm1.turnon();
        System.out.println(alarm1.active);
        alarm1.getReport();
        System.out.println(alarm1.getReport(true));
        
    }
}
