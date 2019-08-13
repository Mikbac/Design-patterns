package adapter.javaExample.OldAppend;

/**
 * Created by MikBac on 2019
 */

public class OldAppend implements OldAppendInterface {

    public StringBuilder appendA(String word) {
        StringBuilder builder = new StringBuilder();
        builder.append(word);

        for (int i = 0; i < 10; i++) {
            builder.append("A");
        }

        return builder;
    }
}
