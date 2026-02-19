package creation.factory;

public class SMSNotification implements Notification{
    public void send() {
        System.out.println("SMS sent");
    }
}
