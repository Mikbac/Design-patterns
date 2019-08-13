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

    public static final class Builder {

        private String name;
        private String surname;
        private BigDecimal salary;
        private Integer age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder salary(BigDecimal salary) {
            this.salary = salary;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Employee build() {

            if (name.isEmpty()) {
             /*
                Some exception
            */
            }

            Employee employee = new Employee();
            employee.name = this.name;
            employee.surname = this.surname;
            employee.salary = this.salary;
            employee.age = this.age;
            return employee;

        }

    }

}
