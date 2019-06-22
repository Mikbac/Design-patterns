package observer.javaExample;


public class ExampleMain {

    public static void main(String[] args) {

        User user = new User();
        user.setNewestUser("Test1");

        Boss boss1 = new Boss(user);
        Boss boss2 = new Boss(user);

        user.addObserver(boss1);
        user.addObserver(boss2);

        user.notifyObserver();
    }
}
