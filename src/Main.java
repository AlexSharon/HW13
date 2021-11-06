//Employee.getSalary должен быть абстрактный
//Worker.getBaseSalary должен быть финальным
//Коэффициенты для расчета ЗП у Manager и Director
//должны быть константами (коэффициенты из формулы расчета ЗП)
//Классы Manager и Director должны быть финальными

public class Main {
    public static void main(String[] args) {
        Worker first = new Worker("Alex", 105);
        Worker second = new Worker("Philipp", 106);
        Manager boss1 = new Manager("David", 25);
        Manager boss2 = new Manager("Karl", 10);
        Manager boss3 = new Manager("Pit", 45);

        Worker[] array_w = {first, second};
        Manager[] array_m = {boss1, boss2, boss3};

        System.out.println(UtilsW.maxAddition(array_m).getName());
    }

}
