package gojava.module6.homework;

public class UserUtils {

    public static User[] uniqueUsers(User[] users) {
        User[] uniqueUsers = new User[users.length];
        int uniqueUsersIndex = 0;
        boolean isUnique = true;
        for (User usersElement : users) {
            for (User uniqueUsersElement : uniqueUsers) {
                if (usersElement.equals(uniqueUsersElement)) {
                    isUnique = false;
                }
            }
            if (isUnique) {
                uniqueUsers[uniqueUsersIndex++] = usersElement;
            }
            isUnique = true;
        }
        return deleteEmptyUsers(uniqueUsers);
    }

    public static User[] usersWithContitionalBalance(User[] users, int balance) {
        User[] usersWithConditionalBalance = new User[users.length];
        int usersWithCondBalIndex = 0;

        for (User usersElement : users) {
            if (usersElement.getBalance() == balance) {
                usersWithConditionalBalance[usersWithCondBalIndex++] = usersElement;
            }
        }
        return deleteEmptyUsers(usersWithConditionalBalance);
    }

    public static final User[] paySalaryToUsers(User[] users) {
        users = uniqueUsers(users);
        for (User usersElement : users) {
            usersElement.setBalance(usersElement.getBalance() + usersElement.getSalary());
        }
        return users;
    }

    public static final long[] getUsersId(User[] users) {
        long[] usersIds = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            usersIds[i] = users[i].getId();
        }
        return usersIds;
    }

    public static User[] deleteEmptyUsers(User[] users) {
        int counter = 0;
        for (User usersElement : users) {
            if (usersElement == null) {
                counter++;
            }
        }
        User[] nonEmptyUsers = new User[users.length - counter];
        counter = 0;
        for (User usersElement : users) {
            if (usersElement != null) {
                nonEmptyUsers[counter++] = usersElement;
            }
        }
        return nonEmptyUsers;
    }
}
