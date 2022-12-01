package com.company;

public class Employee extends Worker {

    private long employeeID;
    private String hireDate;
    private static int employeeNo = 1;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeID = Employee.employeeNo++;
        //increments the employee ID number with each new instance of employee (or a subclass object)
        //assigned as static to share data amongst instances
        // no employeeID parameter necessary as the constructor will create for us.
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }

    //need to select String concat (+) and super,toString() to get the toString print from parent method as well
}
