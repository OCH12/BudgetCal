public class User {
    private String name;
    private String email;
    private ArrayList<Budget> budgets;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.budgets = new ArrayList<>();
    }

    // Methods to add/view budgets
    public void addBudget(Budget budget) {
        this.budgets.add(budget);
    }

    public ArrayList<Budget> getBudgets() {
        return this.budgets;
    }

    // Getters
    public String getName() { return name; }
    public String getEmail() { return email; }
}
