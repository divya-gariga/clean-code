public class NetPay extends GrossPay{
    public void getDeductions() {
        System.out.println("Here the deductions including absences + statutory deduction");
    }
    public void getBonus() {
        System.out.println("Get Bonus...");
    }
    public void netSalary() {
        System.out.println("net pay=gross salary+bonus-deduction");
    }
}
