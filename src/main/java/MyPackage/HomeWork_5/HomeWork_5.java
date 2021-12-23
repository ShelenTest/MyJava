package MyPackage.HomeWork_5;

public class HomeWork_5 {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Нестеров Петр Петрович", "senior developer", "hhh@mail.ru", "89210980909", 100000, 45);
        employeesArray[1] = new Employee("Федоров Петр Петрович", "developer", "hhh@mail.ru", "89215580909", 80000, 30);
        employeesArray[2] = new Employee("Иванов Петр Петрович", "developer", "hhh@mail.ru", "89240980909", 80000, 25);
        employeesArray[3] = new Employee("Петров Петр Петрович", "manager", "hhh@mail.ru", "89210980925", 700000, 43);
        employeesArray[4] = new Employee("Николаев Петр Петрович", "QA engineer", "hhh@mail.ru", "89219080909", 80000, 30);


        printArr(employeesArray);
        printArrAge(employeesArray);
    }

    private static void printArr (Employee[] employeesArray) {
        for (int i=0; i< employeesArray.length; i++) {
            System.out.println((i+1) + ". " + employeesArray[i].getPersonInfo());
        }
        System.out.println("**********************");
    }

    private static void printArrAge (Employee[] employeesArray) {
        for (int i=0; i< employeesArray.length; i++) {
            if (employeesArray[i].getAge() > 40) {
                System.out.println("Старше 40 лет: " + employeesArray[i].getPersonInfo());
            }
        }
    }
}
