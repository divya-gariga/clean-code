public class PermanentEmployeePay extends PayCalculator{
    @Override
    public void getSalary(){
        System.out.println("This is the gross pay of the Permanent employee for the month");
    }
    @Override
    public void getDeductions() {
        System.out.println("Here the deductions including absences + statutory deduction");
    }
    @Override
    public void getBonus() {
        System.out.println("Get Bonus amount for the permanent Employee...");
    }
    @Override
    public void netSalary() {
        System.out.println("PermanentEE net pay=gross salary+bonus-deduction");
    }
}
