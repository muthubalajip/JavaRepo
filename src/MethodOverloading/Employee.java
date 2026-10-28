package MethodOverloading;

public class Employee {

    private long empId;
    private String empName;
    private double salary;

    public Employee(long empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    private void setEmpName(String empName) {
        this.empName = empName;
    }

    private void setSalary(double salary) {
        this.salary = salary;
    }

    // getters
    private long getEmpId() {
        return this.empId;
    }

    private String getEmpName() {
        return this.empName;
    }

    private double getSalary() {
        return this.salary;
    }

    public void update(String empName) {
        setEmpName(empName);

        printDetails();
    }

    public void update(String empName, double salary) {
        setEmpName(empName);
        setSalary(salary);

        printDetails();
    }

    public void printDetails() {
        System.out.format("Empid: %d, Emp Name: %s and Emp salary: %.2f\n", getEmpId(), getEmpName(), getSalary());
    }

}
