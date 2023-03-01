public class Salesperson implements Comparable {
    private String firstName, lastName;
    private int totalSales;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getSales() {
        return this.totalSales;
    }

    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson) other).getLastName())
                && firstName.equals(((Salesperson) other).getFirstName()));
    }

    public int compareTo(Object other) {
        int res = 0;
        Salesperson compare = (Salesperson) other;
        if (this.totalSales < compare.totalSales) {
            res = -1;
        } else if (this.totalSales > compare.totalSales) {
            res = 1;
        }
        return res;
    }
}
