class Manager extends Employee implements Sortable {
    private double bonus;

    public Manager(String n, double s, int day, int month, int year, double b) {
        super(n, s, day, month, year);
        bonus = b;
    }

    public void setBonus(double b) {
        bonus = b;
    }

    public void raiseSalary(double byPercent) {
        super.raiseSalary(byPercent);
        bonus *= 1 + byPercent / 100;
    }

    public int compare(Sortable b) {
        Manager mb = (Manager) b;
        if (bonus + salary < mb.bonus + mb.salary)
            return -1;
        if (bonus + salary > mb.bonus + mb.salary)
            return 1;
        return 0;
    }
}