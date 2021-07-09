package Classes;

import com.arakelian.faker.service.RandomPerson;
import org.apache.commons.lang3.StringUtils;

public class Person {

    private String fname;
    private String lname;

    public Person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public Person(String fname) {
        this(fname, "Default");
    }

    public Person() {
        // default constructor
        this("Default", "Default");
    }

    public void randomiseFname() {
        com.arakelian.faker.model.Person person = RandomPerson.get().next();
        this.fname = StringUtils.capitalize(person.getFirstName().toLowerCase());
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String toString() {
        return this.fname + " " + this.lname;
    }
}
