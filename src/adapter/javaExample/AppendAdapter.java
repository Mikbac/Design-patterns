package adapter.javaExample;

import adapter.javaExample.NewAppend.NewAppend;
import adapter.javaExample.OldAppend.OldAppendInterface;

public class AppendAdapter implements OldAppendInterface {

    NewAppend newAppend;

    public AppendAdapter(NewAppend newAppend) {
        this.newAppend = newAppend;
    }

    public StringBuilder appendA(String word) {
        return newAppend.appendB(word);
    }
}
