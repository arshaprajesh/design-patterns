import builder.User;
import factory.Notification;
import factory.NotificationFactory;
import singleton.Singleton;


public class Main {
    public static void main(String[] args) {

        // Test Singleton
        Singleton.getInstance();
        Singleton.getInstance();
        Singleton.getInstance();

        System.out.println( "Singleton counter: "+Singleton.counter);

        // Test Factory

        Notification n1 = NotificationFactory.getNotification("EMAIL");
        n1.send();
        Notification n2 = NotificationFactory.getNotification("SMS");
        n2.send();

        // Builder Test

        User user = new User.UserBuilder()
                .setName("arsha")
                .setAge(25)
                .setEmail("arshababu333@gmail.com")
                .build();
        System.out.println(user);
    }
}
