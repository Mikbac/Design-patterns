package singleton.javaExample;

/**
 * Created by MikBac on 2019
 */

public class Singleton {

    private static Singleton singleInstance = null;

    private String name;
    private String surname;

    private Singleton() {
        name = "name";
        surname = "surname";
    }

    public static Singleton getInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
            System.out.println("creates new instance");
        } else {
            System.out.println("doesn't create new instance");
        }

        return singleInstance;
    }

    /*some methods*/
    public void setNameAndSurname(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getNameAndSurname() {
        return name + " " + surname;
    }

}
