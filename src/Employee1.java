public class Employee1 {
    private String name;
    protected double salary;
    private int age;

    public Employee1(String name, double salary, int age){
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary() {
        this.salary = this.salary * 1.2;
    }
}
