/**
 * Created by Thompadude on 2016-01-24.
 */
public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Person o) {
        return this.lastName.compareTo(o.lastName);
        // return o.getLastName().compareTo(this.lastName);
    }
}