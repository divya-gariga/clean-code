public class InternBenefits implements Benefits{

    @Override
    public void claimMedicalInsurance() {

    }

    @Override
    public void hra() {
    }
    //cannot override MedicalInsurance and hra methods

    @Override
    public void claimReimbursement() {
        System.out.println("Intern can claim Reimbursement like broadband etc...");
    }

}
