public class Designation {
    int salary;
    public void setSalary(String designation){
        if(designation.equals("ASE")){
            salary=30000;
            System.out.println("ASE's salary is set to: "+salary);
        }
        else if(designation.equals("SE"))
        {
            salary=60000;
            System.out.println("SE's salary is set to :"+salary);
        }
    }
}
