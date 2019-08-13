package adapter.javaExample;

import adapter.javaExample.NewAppend.NewAppend;

/**
 * Created by MikBac on 2019
 */

public class ExampleMain {

    public static void main(String[] args) {

        NewAppend newAppend = new NewAppend();

        AppendAdapter appendAdapter = new AppendAdapter(newAppend);

        System.out.println(appendAdapter.appendA("White"));

    }
}
