import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Payable> paymentqueue = new ArrayList<>();
        CreditCard visa = new CreditCard("Batman", 1000, 5000);
        MealPlan lunch = new MealPlan("Robin", 200);
        paymentqueue.add(visa);
        paymentqueue.add(lunch);
        
        for (Payable payment : paymentqueue) {
            payment.processPayment(50);
            payment.validateAccount();
        }
        System.out.println(visa.totalTransactions);
        System.out.println(lunch.totalTransactions);
    }
}

