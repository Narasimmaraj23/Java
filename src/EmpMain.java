public class EmpMain {
    public  static void main(String[] args){
        Employee employeeOne = new Employee("Naresh","Cbe",100000,19);
        Employee employeeTwo = new Employee("Ashwanth","Cbe",200000,20);

//        String name = new String("Kadhir");
//        System.out.println(name.toUpperCase());
//        String name = "kadhir";
//        System.out.println(name);
//        name = "Ashwanth";
//
//        System.out.println(name);
//        double number = 12.3;
//        System.out.println(number);
//        number = 32;
//        System.out.println(number);


        System.out.println(employeeOne.salary);

        employeeOne.raiseSalary();

        System.out.println(employeeOne.salary);
        System.out.println(employeeTwo.salary);
    }
}
