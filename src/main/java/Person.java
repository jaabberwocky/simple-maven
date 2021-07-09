import com.arakelian.faker.service.RandomPerson;
import com.sun.xml.internal.ws.util.StringUtils;

public class Person {

    private String fname;
    private String lname;

    public Person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
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
