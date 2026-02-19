import creation.builder.User;
import creation.factory.Notification;
import creation.factory.NotificationFactory;
import creation.singleton.CustomerSingleton;


public class Main {
    public static void main(String[] args) {

        // Test Singleton ( only once  hashing , cache , Database object )
        CustomerSingleton.getInstance();
        CustomerSingleton.getInstance();
        CustomerSingleton.getInstance();

        System.out.println( "Singleton counter: "+ CustomerSingleton.counter);

        // Test Factory ( One place - factory )

        Notification n1 = NotificationFactory.getNotification("EMAIL");
        n1.send();
        Notification n2 = NotificationFactory.getNotification("SMS");
        n2.send();

        // Builder Test ( PWO)
        User user1 = new User.UserBuilder()
                .setName("arsha")
                .setAge(25)
                .setEmail("arshababu333@gmail.com")
                .build();
        System.out.println(user1);

        User user2 = new User.UserBuilder()
                .setName("arshaBabu")
                .build();
        System.out.println(user2);
    }
}
