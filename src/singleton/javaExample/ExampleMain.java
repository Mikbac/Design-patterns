package singleton.javaExample;

public class ExampleMain {

    public static void main(String[] args) {

        Singleton one = Singleton.getInstance();
        Singleton two = Singleton.getInstance();
        Singleton three = Singleton.getInstance();

        one.setNameAndSurname("Tom", "Brown");

        System.out.println(one.getNameAndSurname());
        System.out.println(two.getNameAndSurname());
        System.out.println(three.getNameAndSurname());

        two.setNameAndSurname("Paul", "Landers");

        System.out.println(one.getNameAndSurname());
        System.out.println(two.getNameAndSurname());
        System.out.println(three.getNameAndSurname());

        three.setNameAndSurname("Johnny", "Silverhand");

        System.out.println(one.getNameAndSurname());
        System.out.println(two.getNameAndSurname());
        System.out.println(three.getNameAndSurname());

    }
}
