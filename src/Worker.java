public class Worker {

    private String name;
    static double baseSalary = 100;
    private double salary;

    public Worker(String name) {
        this.salary = baseSalary;
        this.name = name;
    }
    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public final double getBaseSalary() {
        return baseSalary;
    }

    public double getSalary() {
        return salary;
    }
}
