import java.util.Comparator;

class PersonSuperComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        int namesCompare = p1.getName().compareTo(p2.getName());
        int ageCompare = p1.getAge() - p2.getAge();

        if (namesCompare == 0) {
            return ageCompare;
        }
        return namesCompare;
    }
}
