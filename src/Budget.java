import java.util.ArrayList;


public class Budget {
    private String name;
    private double amount;
    private double currentExpense;
    private ArrayList<Transactions> transactions;

    public Budget(String name, double amount) {
        this.name = name;
        this.amount = amount;
        this.currentExpense = 0.0;
        this.transactions = new ArrayList<>();
    }

    // Method to add a transaction
    public String addTransaction(Transactions transaction) {
        double newSpending = currentExpense + transaction.getAmount();
        if (newSpending > amount) {
            return "Overspending! Transaction exceeds budget limit.";
        } else {
            transactions.add(transaction);
            currentExpense = newSpending;
            return "Transaction added successfully.";
        }
    }

    public double getTotalAmount() {
        double total = amount;
        for (Transactions t : transactions) {
            total -= t.getAmount();
        }
        return total;
    }

    // Getters
    public String getName() {
        return name; }

    public double getAmount() {
        return amount; }

    public double getCurrentExpense() {
        return currentExpense; }

    public ArrayList<Transactions> getTransactions() {
        return transactions; }


    // Existing methods...

    public void generateReport() {
        System.out.println("Budget Report:");
        System.out.println("Total Budget: " + amount);
        System.out.println("Current Spending: " + currentExpense);
        System.out.println("Remaining Budget: " + getTotalAmount());

        System.out.println("\nTransactions:");
        for (Transactions transaction : transactions) {
            System.out.println(transaction);
        }
    }
}


/*public class Budget {
        private String name;
        private double amount;
        private double currentExpense=  0.0;
        private ArrayList<Transactions> transactions;

        public Budget(String name, double amount) {
            this.name = name;
            this.amount = amount;
            double currentExpense = this.currentExpense;
            this.transactions = new ArrayList<>();
        }

        // Methods to add/view transactions
        public void addTransaction(Transactions transaction) {
            this.transactions.add(transaction);
        }

        public double getTotalAmount() {
            double total = amount;
            for (Transactions t : transactions) {
                total -= t.getAmount();
            }
            return total;
        }

    // Method to add a transaction
    public String addTransaction(Transactions transaction) {
        double newSpending = currentExpense + transaction.getAmount();
        if (newSpending > amount) {
            return "Overspending! Transaction exceeds budget limit.";
        } else {
            transactions.add(transaction);
            currentExpense = newSpending;
            return "Transaction added successfully.";
        }
    }


    // Getters
        public String getName() { return name; }
        public double getAmount() { return amount; }
    }
/*
public class Budget {
    private String name;
    private double amount;  // Total available budget
    private double currentSpending;  // Amount already spent
    private ArrayList<Transaction> transactions;

    public Budget(String name, double amount) {
        this.name = name;
        this.amount = amount;
        this.currentSpending = 0.0;  // Start with no spending
        this.transactions = new ArrayList<>();
    }

    // Method to add a transaction
    public String addTransaction(Transaction transaction) {
        double newSpending = currentSpending + transaction.getAmount();
        if (newSpending > amount) {
            return "Overspending! Transaction exceeds budget limit.";
        } else {
            transactions.add(transaction);
            currentSpending = newSpending;
            return "Transaction added successfully.";
        }
    }

    public double getCurrentSpending() {
        return currentSpending;
    }

    public double getRemainingBudget() {
        return amount - currentSpending;
    }

    public String getName() { return name; }
    public double getAmount() { return amount; }
}
*/
