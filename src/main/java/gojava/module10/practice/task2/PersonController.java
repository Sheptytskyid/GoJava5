package gojava.module10.practice.task2;

import java.util.Map;

import static gojava.module10.practice.task2.UsePersonApp.EMAIL;
import static gojava.module10.practice.task2.UsePersonApp.FIRST_NAME;
import static gojava.module10.practice.task2.UsePersonApp.SECOND_NAME;

public class PersonController {

    PersonDao personDao = new PersonDaoImpl();

    public void save(Map<String, String> requestParams) throws Exception {
        String firstName = requestParams.get(FIRST_NAME);
        String secondName = requestParams.get(SECOND_NAME);
        String eMail = requestParams.get(EMAIL);
        if (firstName == null || firstName.isEmpty() || eMail == null || eMail.isEmpty()) {
            throw new Exception("Name and Email should be filled");
        }
        personDao.save(new Person(firstName, secondName, eMail));
    }

    public String findByEmail(Map<String, String> requestParams) throws Exception {
        String firstName = requestParams.get(FIRST_NAME);
        String secondName = requestParams.get(SECOND_NAME);
        String eMail = requestParams.get(EMAIL);
        if (eMail == null || eMail.isEmpty()) {
            throw new Exception("Email should be filled");
        }
        String foundEmail = null;
        try {
            foundEmail = personDao.findByEmail(new Person(firstName, secondName, eMail)).getEmail();
        } catch (Exception e) {
            System.out.println("Be carefull " + e.getMessage());
            e.printStackTrace();
        }
        return foundEmail;
    }
}
