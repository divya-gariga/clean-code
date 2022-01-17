public class SoftwareEngineer implements Designation{
    int salary;
    @Override
    public void setSalary() {
        salary = 60000;
        System.out.println("Software Engineer's salary is set to :"+salary );
    }
}
