package creation.factory;


public class NotificationFactory {

    public static Notification getNotification(String type) {
        if (type.equalsIgnoreCase("EMAIL")) {
            //we have to create the notifcation instance only in the Notification factory
            return new EmailNotification();
        }
        if (type.equalsIgnoreCase("SMS")) {
            //we have to create the notifcation instance only in the Notification factory
            return new SMSNotification();
        }
        return null;
    }
}
