package strategy.javaExample.strategies;


import strategy.javaExample.AppendStrategy;

public class AppendAStrategy implements AppendStrategy {

    public StringBuilder appendChars(String baseString, int number) {
        StringBuilder builder = new StringBuilder();
        builder.append(baseString);

        for (int i = 0; i < number; i++) {
            builder.append("A");
        }

        return builder;

    }

}
