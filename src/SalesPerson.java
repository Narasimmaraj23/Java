public class SalesPerson extends Employee1 {
    private double commissionPercentage;

    public SalesPerson(String name, double salary,int age,double commissionPercentage){
        super(name, salary, age);
       this.commissionPercentage = commissionPercentage;
    }

    public double getCommissionPercentage() {
        return commissionPercentage;
    }

    public double getAnnualBonus(){
        return this.salary * .05;
    }


}
