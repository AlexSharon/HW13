public abstract class Employee {
    private int baseSalary = 100;
    private String name;

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setName(String name) {
        name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    public abstract int getSalary();
}
