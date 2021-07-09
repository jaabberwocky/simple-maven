public class Main {
    public static void main(String[] args) {
        Person p = new Person("James", "Bond");
        System.out.println(p);

        System.out.println("Time to randomise!");
        p.randomiseFname();
        System.out.println(p);
    }
}
