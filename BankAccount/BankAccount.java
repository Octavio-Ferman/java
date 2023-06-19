class BankAccount {

    private double checkingBalance;
    private double savingsBalance;
    public static int numberOfAccounts = 0;
    public static double totalBalances = 0;

    public BankAccount() {

        BankAccount.numberOfAccounts += 1;
        this.checkingBalance = 0;
        this.savingsBalance = 0;

    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void depositMoney(double amount, String account) {
        if (account == "checking") {
            this.checkingBalance += amount;
        }
        else {
            this.savingsBalance += amount;
        }

        this.totalBalances += amount;
    }

    public void withdrawMoney(double amount, String account) {
        if (account == "checking") {
            if (amount > this.checkingBalance) {
                System.out.println("Insufficient Funds");
                return; 
            }
            this.checkingBalance -= amount;
        }
        else {
            if (amount > this.savingsBalance) {
                System.out.println("Insufficient Funds");
                return; 
            }
            this.savingsBalance -= amount;
        }

        this.totalBalances -= amount;
    }

}