public class UtilsW {
    public static Worker searchByName(Worker[] arr, String name) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().equals(name)) {
                return arr[i];
            }
        }
        return null;
    }

    public static Worker searchByNamePart(Worker[] arr, String fragment) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().contains(fragment)) {
                return arr[i];
            }
        }
        return null;
    }

    public static double countSalary(Worker[] arr) {
        double salary = 0;
        for (int i = 0; i < arr.length; i++) {
            salary += arr[i].getSalary();
        }
        return salary;
    }
    public static double minSalary(Worker[] arr) {
        double minSalary = arr[0].getSalary();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getSalary() < minSalary) {
                minSalary = arr[i].getSalary();
            }
        }
        return minSalary;
    }

    public static double maxSalary(Worker[] arr) {
        double maxSalary = arr[0].getSalary();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getSalary() > maxSalary) {
                maxSalary = arr[i].getSalary();
            }
        }
        return maxSalary;
    }

    public static int findBaseManager(Manager[] arr) {
        int minStaff = arr[0].getNumberOfSubordinates();
        int counter = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getNumberOfSubordinates() < minStaff) {
                minStaff = arr[i].getNumberOfSubordinates();
            }
            counter++;
        }
        System.out.println(arr[counter].getName() + " has " + minStaff + " subordinate(s)");
        return minStaff;
    }

    public static int findTopManager(Manager[] arr) {
        int maxStaff = arr[0].getNumberOfSubordinates();
        int counter = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getNumberOfSubordinates() > maxStaff) {
                maxStaff = arr[i].getNumberOfSubordinates();
            }
            counter++;
        }
        System.out.println(arr[counter].getName() + " has " + maxStaff + " subordinate(s)");
        return maxStaff;
    }

    public static Manager maxAddition(Manager[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        double maxAddition = arr[0].getSalary() - arr[0].getBaseSalary();
        Manager result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            double dif = arr[i].getSalary() - arr[i].getBaseSalary();
            if (dif > maxAddition) {
                maxAddition = dif;
                result = arr[i];
            }
        }
        return result;
    }
}
