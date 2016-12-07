package gojava.module6.homework;

public class UserUtils {

    public static User[] uniqueUsers(User[] users) {
        User[] uniqueUsers = new User[users.length];
        int index = 0;
        boolean isUnique = true;
        for (int i = 0; i < users.length; i++) {
            for (int j = i + 1; j < users.length; j++) {
                if (users[i].equals(users[j])) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueUsers[index++] = users[i];
            }
            isUnique = true;
        }
        return deleteEmptyUsers(uniqueUsers);
    }

    public static User[] usersWithConditionalBalance(User[] users, int balance) {
        User[] usersWithCondBal = new User[users.length];
        int index = 0;
        for (User user : users) {
            if (user.getBalance() == balance) {
                usersWithCondBal[index++] = user;
            }
        }
        return deleteEmptyUsers(usersWithCondBal);
    }

    public static final User[] paySalaryToUsers(User[] users) {
        users = uniqueUsers(users);
        for (User user : users) {
            user.setBalance(user.getBalance() + user.getSalary());
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
        for (User user : users) {
            if (user == null) {
                counter++;
            }
        }
        User[] nonEmptyUsers = new User[users.length - counter];
        counter = 0;
        for (User user : users) {
            if (user != null) {
                nonEmptyUsers[counter++] = user;
            }
        }
        return nonEmptyUsers;
    }
}
