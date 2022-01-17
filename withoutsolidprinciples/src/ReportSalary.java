public class ReportSalary {
    ReportToFile toFile;
    public ReportSalary(ReportToFile r)
    {
        this.toFile=r;
    }
    public void reporting()
    {
        toFile.reporting();
    }
}
