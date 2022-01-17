public class Payroll {
    public static void main(String[] args) {
        //violating SRP
        Deductions deductions=new Deductions();
        deductions.calculateAbsences();
        deductions.calculateStatutory();

        //violating open/close
        Designation designation=new Designation();
        designation.setSalary("ASE");

        //violating liskov
        PermanentEmployeePay permanentEEPay=new PermanentEmployeePay();
        permanentEEPay.netSalary();

        //violating interface segregation
        PermanentEmployeeBenefits permanentEEBenefits=new PermanentEmployeeBenefits();
        permanentEEBenefits.claimMedicalInsurance();
        permanentEEBenefits.claimReimbursement();
        InternBenefits internBenefits=new InternBenefits();
        internBenefits.claimReimbursement();

        //violating Dependency inversion
        ReportSalary reportSalary=new ReportSalary(new ReportToFile());
        reportSalary.reporting();

    }
}
