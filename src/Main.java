import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Вика", 20);
        Person p2 = new Person("Вика", 35);
        Person p3 = new Person("Максим", 17);
        Person p4 = new Person("Максим", 40);
        Person p5 = new Person("Андрей", 23);
        Person p6 = new Person("Андрей", 38);


        ArrayList<Person> persons = getPeople(p1, p2, p3, p4, p5, p6);


        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println();

        persons.sort(new PersonSuperComparator());
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    private static ArrayList<Person> getPeople(Person p1, Person p2, Person p3, Person p4, Person p5, Person p6) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        persons.add(p6);
        return persons;
    }
}