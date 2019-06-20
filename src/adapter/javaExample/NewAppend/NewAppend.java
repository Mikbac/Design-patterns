package adapter.javaExample.NewAppend;

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
