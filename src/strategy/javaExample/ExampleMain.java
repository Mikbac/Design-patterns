package strategy.javaExample;

import strategy.javaExample.strategies.AppendAStrategy;
import strategy.javaExample.strategies.AppendBStrategy;
import strategy.javaExample.strategies.AppendCStrategy;

public class ExampleMain {

    public static void main(String[] args) {

        AppendContext appendContext = new AppendContext();

        appendContext.setStrategy(new AppendAStrategy());
        System.out.println(appendContext.append("Lorem ipsum", 5));

        appendContext.setStrategy(new AppendBStrategy());
        System.out.println(appendContext.append("Lorem ipsum", 10));

        appendContext.setStrategy(new AppendCStrategy());
        System.out.println(appendContext.append("Lorem ipsum", 15));


    }
}
