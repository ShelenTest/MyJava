package MyPackage.HomeWork_5;

public class Employee {

    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    int getSalary() { return salary; }
    int getAge() { return age; }
    String getPersonInfo(){
        return this.name + " " + this.position +" email "+ this.email + " phone " + this.phone + " " + getSalary() + " Ru " + getAge()+ " years old";
    }
}