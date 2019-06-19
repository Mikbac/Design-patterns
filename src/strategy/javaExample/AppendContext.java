package strategy.javaExample;

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
