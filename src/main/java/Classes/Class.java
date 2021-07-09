package Classes;

public class Class {
    public static void main(String[] args) {
        Person p = new Person("James", "Bond");
        Person p2 = new Person();
        Person p3 = new Person("James");
        System.out.println(p);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("Time to randomise!");
        p.randomiseFname();
        System.out.println(p);
    }
}
