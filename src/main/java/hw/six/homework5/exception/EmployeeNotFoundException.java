package hw.six.homework5.exception;

import hw.six.homework5.model.Employee;

public class EmployeeNotFoundException extends RuntimeException {
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }
}
