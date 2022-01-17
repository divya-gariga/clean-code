public class PermanentEmployeeBenefits implements Benefits, ReimbursementBenefit{

    @Override
    public void claimMedicalInsurance() {
        System.out.println("PermanentEE can claim MedicalInsurance...");
    }

    @Override
    public void hra() {
        System.out.println("PermanentEE can receive HRA...");
    }

    @Override
    public void claimReimbursement() {
        System.out.println("PermanentEE can claim Reimbursements like Broadband etc...");
    }
}
