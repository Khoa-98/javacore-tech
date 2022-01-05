public class Kitchen extends Emlpoyee{
    private long servicecharge;

    public Kitchen(int id, String name, int age, long basicSalary, long servicecharge) {
        super(id, name, age, basicSalary);
        this.servicecharge = servicecharge;
    }

    public long getServicecharge() {
        return servicecharge;
    }

    public void setServicecharge(long servicecharge) {
        this.servicecharge = servicecharge;
    }

    @Override
    public String toString() {
        return super.toString() + " - " +
                "servicecharge=" + servicecharge + " - salary: " + calculatorSalary();
    }

    @Override
    public long calculatorSalary() {
        return servicecharge + getBasicSalary();
    }
}
