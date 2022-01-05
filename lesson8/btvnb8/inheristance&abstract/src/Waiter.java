public class Waiter extends Emlpoyee{
    private long compensate;

    public Waiter(int id, String name, int age, long basicSalary, long compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    public long getCompensate() {
        return compensate;
    }

    public void setCompensate(long compensate) {
        this.compensate = compensate;
    }

    @Override
    public String toString() {
        return super.toString() + " - " +
                "compensate=" + compensate + " - " + "Salary: " + calculatorSalary();
    }

    @Override
    public long calculatorSalary() {
        return compensate + getBasicSalary();
    }


}
