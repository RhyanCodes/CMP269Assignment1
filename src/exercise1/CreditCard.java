package exercise1;

class CreditCard extends PaymentMethod {
    private double creditLimit;

    public CreditCard(String accountHolder, double balance, double creditLimit) {
        super(accountHolder, balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void validateAccount() {
        System.out.println("Validating Credit Card for " + accountHolder);
    }

    @Override
    public void processPayment(double amount) {
        if (amount > balance + creditLimit) {
            System.out.println("Transaction Declined");
        } else {
            balance -= amount;
            totalTransactions++;
            System.out.println("Transaction Approved");
        }
    }
}