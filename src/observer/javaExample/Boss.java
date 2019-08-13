package observer.javaExample;

/**
 * Created by MikBac on 2019
 */

public class Boss implements Observer {
    private final User user;
    private String newestUser;

    public Boss(User user) {
        this.user = user;
        newestUser = user.getNewestUser();
    }

    @Override
    public void update() {
        newestUser = user.getNewestUser();
        System.out.println("User was added! -> " + user.getNewestUser());
    }
}
