class Employee implements Sortable {
    private String name;
    protected double salary;
    private int hireDay;
    private int hireMonth;
    private int hireYear;

    public Employee(String n, double s, int day, int month, int year) {
        name = n;
        salary = s;
        hireDay = day;
        hireMonth = month;
        hireYear = year;
    }

    public void print() {
        System.out.println(name + " " + salary + " " + hireYear);
    }

    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100;
    }

    public int compare(Sortable b) {
        Employee eb = (Employee) b;
        if (salary < eb.salary)
            return -1;
        if (salary > eb.salary)
            return 1;
        return 0;
    }

    public static void shell_sort(Sortable[] a) {
        int inner, outer;
        Sortable temp;
        int h = 1;
        while (h <= a.length / 3)
            h = h * 3 + 1;

        while (h > 0) {
            for (outer = h; outer < a.length; outer++) {
                temp = a[outer];
                inner = outer;

                while (inner > h - 1 && a[inner - h].compare(temp) >= 0) {
                    a[inner] = a[inner - h];
                    inner -= h;
                }
                a[inner] = temp;
            }
            h = (h - 1) / 3;
        }
    }
}