package gojava.module10.practice.task2;

public interface PersonDao {

    public Person save(Person person) throws Exception;

    public Person findByEmail(Person person);
}
