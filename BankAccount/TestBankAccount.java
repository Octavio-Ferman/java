class TestBankAccount {
    public static void main(String[] args) {

        BankAccount octavioBankAccount = new BankAccount();
        octavioBankAccount.depositMoney(500, "checking");
        octavioBankAccount.depositMoney(1000, "savings");
        octavioBankAccount.withdrawMoney(100, "checking");
        octavioBankAccount.withdrawMoney(200, "savings");
        octavioBankAccount.withdrawMoney(550, "checking");
        octavioBankAccount.withdrawMoney(1100, "savings");

        // octavioBankAccount.displayAccountBalance();
        System.out.println(octavioBankAccount.getCheckingBalance());
        System.out.println(octavioBankAccount.getSavingsBalance());

        System.out.println(BankAccount.totalBalances);

    }
}