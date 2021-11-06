public class Worker implements IEmployee {

    private String name;
    private double baseSalary;

    public Worker(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    @Override
    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getBaseSalary() {
        return this.baseSalary;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getSalary() {
        return getBaseSalary();
    }
}
