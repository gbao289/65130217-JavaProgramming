class BankAccount {
    private String accountNumber;
    private String owner;
    private double balance;

    public BankAccount(String accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Khong du tien!");
        }
    }

    public void transfer(BankAccount other, double amount) {
        if (amount <= balance) {
            this.withdraw(amount);
            other.deposit(amount);
        }
    }

    public void display() {
        System.out.println(owner + " - So du: " + balance);
    }
}