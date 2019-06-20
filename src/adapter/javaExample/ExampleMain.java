package adapter.javaExample;


import adapter.javaExample.NewAppend.NewAppend;

public class ExampleMain {

    public static void main(String[] args) {

        NewAppend newAppend = new NewAppend();

        AppendAdapter appendAdapter = new AppendAdapter(newAppend);

        System.out.println(appendAdapter.appendA("White"));


    }
}
