package tb.soft;

import java.util.Objects;

public class PersonClone extends Person{
    public PersonClone(String first_name, String last_name) throws PersonException {
        super(first_name, last_name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getBirthYear() == person.getBirthYear() && getFirstName().equals(person.getFirstName()) && getLastName().equals(person.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getBirthYear());
    }

}
