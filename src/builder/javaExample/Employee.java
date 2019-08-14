package builder.javaExample;

import java.math.BigDecimal;

/**
 * Created by MikBac on 13.08.2019
 */

public class Employee {

    private String name;
    private String surname;
    private BigDecimal salary;
    private Integer age;

    public static EmployeeBuilder prepare() {
        return new EmployeeBuilder();
    }

    public static final class EmployeeBuilder {

        private Employee employee;

        public EmployeeBuilder() {
            this.employee.name = "Bob";
        }

        public EmployeeBuilder withName(String name) {
            this.employee.name = name;
            return this;
        }

        public EmployeeBuilder withSurname(String surname) {
            this.employee.surname = surname;
            return this;
        }

        public EmployeeBuilder withSalary(BigDecimal salary) {
            this.employee.salary = salary;
            return this;
        }

        public EmployeeBuilder withAge(Integer age) {
            this.employee.age = age;
            return this;
        }

        public Employee build() {
            return this.employee;

        }

    }

}
