
public final class Manager extends Worker {
    private int NumberOfSubordinates;

    private final double COEF = 9 * NumberOfSubordinates / 100.0;
    public int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.NumberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {

        if (NumberOfSubordinates == 0) {
            return super.getBaseSalary();
        } else {
            return baseSalary + (baseSalary * COEF);
        }

    }

    public Manager(String name) {
        super(name);
    }
    public Manager(String name, int NumberOfSubordinates) {
        super(name);
        this.NumberOfSubordinates = NumberOfSubordinates;
    }
}
