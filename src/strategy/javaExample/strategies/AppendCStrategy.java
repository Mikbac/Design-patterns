package strategy.javaExample.strategies;

import strategy.javaExample.AppendStrategy;

/**
 * Created by MikBac on 2019
 */

public class AppendCStrategy implements AppendStrategy {

    public StringBuilder appendChars(String baseString, int number) {
        StringBuilder builder = new StringBuilder();
        builder.append(baseString);

        for (int i = 0; i < number; i++) {
            builder.append("C");
        }

        return builder;

    }
}
