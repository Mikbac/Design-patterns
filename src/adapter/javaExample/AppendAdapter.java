package adapter.javaExample;

import adapter.javaExample.NewAppend.NewAppend;
import adapter.javaExample.OldAppend.OldAppendInterface;

/**
 * Created by MikBac on 2019
 */

public class AppendAdapter implements OldAppendInterface {

    NewAppend newAppend;

    public AppendAdapter(NewAppend newAppend) {
        this.newAppend = newAppend;
    }

    public StringBuilder appendA(String word) {
        return newAppend.appendB(word);
    }
}
