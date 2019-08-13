package strategy.javaExample;

/**
 * Created by MikBac on 2019
 */

public class AppendContext {

    AppendStrategy strategy;

    public void setStrategy(AppendStrategy strategy) {
        this.strategy = strategy;
    }

    public StringBuilder append(String baseString, int number) {
        StringBuilder builder;
        builder = strategy.appendChars(baseString, number);

        return builder;
    }
}
