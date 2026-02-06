class MealPlan extends PaymentMethod { 

    public MealPlan(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override 
    public void validateAccount() {
        if (balance < 0) {
            System.out.println("Invalid Account");
        } else {
            System.out.println("Valid Account");
        }
    }

    @Override
    public void processPayment(double amount) {    
        if (amount > balance) {
            System.out.println("Transaction Declined");
        } else {
            balance -= amount;
            totalTransactions++;
            System.out.println("Transaction Approved");
        }
    }
}
