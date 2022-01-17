public class AssociateSoftwareEngineer implements Designation{
    int salary;
    @Override
    public void setSalary() {
        salary = 30000;
        System.out.println("Associate software engineer's  salary set to :" +salary);
    }
}
