package gojava.module10.practice.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonDaoImpl implements PersonDao {

    List<Person> persons = new ArrayList<>();

    @Override
    public Person save(Person person) throws Exception {
        boolean result = persons.add(person);
        if (!result) {
            throw new Exception("Failed to save to DB");
        }
        return person;
    }

    @Override
    public Person findByEmail(Person person) {
        Optional<Person> first = persons.stream().filter(param -> person.getEmail().equals(param.getEmail()))
            .findFirst();
        if (first.isPresent()) {
            return first.get();
        } else {
            throw new PersonNotFoundException("No User with such email: " + person.getEmail());
        }
    }
}