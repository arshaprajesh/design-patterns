package behavioral.Strategy;

import behavioral.Strategy.CardPayment;
import behavioral.Strategy.PaymentContext;
import behavioral.Strategy.UPIPayment;

public class StrategyDemo {

    public static void run() {
        PaymentContext context;

        context = new PaymentContext(new CardPayment());
        context.processPayment(100);

        context = new PaymentContext(new UPIPayment());
        context.processPayment(200);
    }
}
