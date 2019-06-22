package observer.javaExample;


public class ExampleMain {

    public static void main(String[] args) {

        User user = new User();
        user.setNewestUser("Test1");

        Boss boss = new Boss(user);

        user.addObserver(boss);
        user.notifyObserver();
        user.setNewestUser("Test2");
        user.deleteObserver(boss);

        boss.update();
    }
}
