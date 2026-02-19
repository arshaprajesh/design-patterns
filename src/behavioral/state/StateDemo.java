package behavioral.state;

public class StateDemo {
    public static void run() {
        Context context = new Context();

        context.setState(new StartState());
        context.request();

        context.setState(new StopState());
        context.request();
    }
}
