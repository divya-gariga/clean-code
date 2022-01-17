public class Payroll {
    public static void main(String[] args) {
        //SRP
        CalculateAbsences absences = new CalculateAbsences();
        absences.calculatingAbsences();
        CalculateStatutory statutory = new CalculateStatutory();
        statutory.calculatingStatutory();

        //open/closed
        AssociateSoftwareEngineer associateSE=new AssociateSoftwareEngineer();
        associateSE.setSalary();

        //Liskov
        PermanentEmployeePay permanentEEPay=new PermanentEmployeePay();
        permanentEEPay.netSalary();
        InternPay internPay=new InternPay();
        internPay.getSalary();

        //interface segregation
        InternBenefits internBenefits=new InternBenefits();
        internBenefits.claimReimbursement();
        PermanentEmployeeBenefits permanentEEBenefits=new PermanentEmployeeBenefits();
        permanentEEBenefits.claimMedicalInsurance();
        permanentEEBenefits.claimReimbursement();

       //Dependency Inversion
        ReportSalary reportSalary=new ReportSalary(new ReportToFile());
        reportSalary.reporting();
    }
}
