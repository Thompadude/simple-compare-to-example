import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Thompadude on 2016-01-24.
 */
public class Main {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Kalle", "Kula"));
        persons.add(new Person("Thompa", "Dude"));
        persons.add(new Person("Anders", "Persson"));
        persons.add(new Person("Per", "Karlsson"));
        persons.add(new Person("Greta", "Garbo"));

        Collections.sort(persons);

        for (Person person : persons) {
            System.out.println(person.getLastName() + ", " + person.getFirstName());
        }
    }

}