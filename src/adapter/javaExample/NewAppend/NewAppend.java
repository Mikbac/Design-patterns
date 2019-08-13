package adapter.javaExample.NewAppend;

/**
 * Created by MikBac on 2019
 */

public class NewAppend implements NewAppendInterface {

    public StringBuilder appendB(String word) {

        StringBuilder builder = new StringBuilder();
        builder.append(word);

        for (int i = 0; i < 10; i++) {
            builder.append("B");
        }

        return builder;
    }
}
