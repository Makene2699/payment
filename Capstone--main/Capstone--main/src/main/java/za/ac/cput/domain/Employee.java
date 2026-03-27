package za.ac.cput.domain;

public class Employee {
    // 1. Private fields
    private String employeeId;
    private String firstName;
    private String lastName;

    // 2. Private constructor (so it can only be created via the Builder)
    private Employee(Builder builder) {
        this.employeeId = builder.employeeId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    // 3. Getters (No setters, to keep the object immutable)
    public String getEmployeeId() { return employeeId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    @Override
    public String toString() {
        return "Employee{" + "id='" + employeeId + '\'' + ", name='" + firstName + " " + lastName + '\'' + '}';
    }

    // 4. Static Inner Builder Class
    public static class Builder {
        private String employeeId;
        private String firstName;
        private String lastName;

        // Builder methods for each field
        public Builder setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        // The build method that creates the actual Employee object
        public Employee build() {
            return new Employee(this);
        }

        // Copy method (Optional but useful for the pattern)
        public Builder copy(Employee employee) {
            this.employeeId = employee.employeeId;
            this.firstName = employee.firstName;
            this.lastName = employee.lastName;
            return this;
        }
    }
}