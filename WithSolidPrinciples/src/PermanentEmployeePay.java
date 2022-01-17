public class PermanentEmployeePay extends NetPay{
    public void getSalary() {
        super.getSalary();
    }
    public void getDeductions() {
        super.getDeductions();
    }
    public void getBonus() {
        super.getBonus();
    }
    public void netSalary() {
        System.out.println("Here is the net Pay of permanent EE (net pay=Gross pay+bonus-deductions)");
    }
}
