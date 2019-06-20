package adapter.javaExample.OldAppend;

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
