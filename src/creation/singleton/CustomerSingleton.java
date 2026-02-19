package creation.singleton;

public class CustomerSingleton {
    private static CustomerSingleton instance;
    public static int counter = 0;

    //Private Constructor
    private CustomerSingleton() {

        counter++;
    }

    public static CustomerSingleton getInstance() {
       //Create the instance only when its not created already.
        if (instance == null) {
            instance = new CustomerSingleton();
        }
        return instance;
    }
}
