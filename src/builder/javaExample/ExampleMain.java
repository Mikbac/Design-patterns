package builder.javaExample;

import java.math.BigDecimal;

/**
 * Created by MikBac on 13.08.2019
 */

public class ExampleMain {

    public static void main(String[] args) {

        Employee employee = Employee.prepare()
                .name("Bob")
                .surname("Black")
                .salary(BigDecimal.valueOf(9999.99))
                .age(77)
                .build();

    }
}
