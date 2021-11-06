
public final class Manager implements IEmployee {
    private int NumberOfSubordinates;

    private final double COEF = 9 * NumberOfSubordinates / 100.0;
    public int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.NumberOfSubordinates = numberOfSubordinates;
    }

    public double getSalary() {

        if (NumberOfSubordinates == 0) {
            return getBaseSalary();
        } else {
            return getBaseSalary() + (getBaseSalary() * COEF);
        }
    }

    public Manager(String name) {
        setName(name);
    }
    public Manager(String name, int NumberOfSubordinates) {
        setName(name);
        this.NumberOfSubordinates = NumberOfSubordinates;
    }
}
