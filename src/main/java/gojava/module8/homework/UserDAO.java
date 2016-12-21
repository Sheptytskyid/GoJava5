package gojava.module8.homework;

import static gojava.module7.homework.Task2.getPositiveRandId;

public class UserDAO extends AbstractDAOImpl<User> {

    public UserDAO() {
        this.save(new User(getPositiveRandId(), "Denys Sheptytskyi"));
        this.save(new User(getPositiveRandId(), "Roman Malyi"));
        this.save(new User(getPositiveRandId(), "Vasul Kozak"));
    }

    @Override
    public void deleteById(long id) {
        dataBase.removeIf(entity -> entity.getId() == id);
    }

    @Override
    public User get(long id) {
        for (User user : dataBase) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
