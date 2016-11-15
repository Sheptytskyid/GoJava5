package module4.homework;

public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        double totalAmount = amount + user.getBank().getCommission(amount);

        if (totalAmount >= user.getBank().getLimitOfWithdrawal()) {
            System.out.println("Withdrawal error: Limit exceeded!");
            return;
        }
        if (totalAmount >= user.getBalance()) {
            System.out.println("Withdrawal error: insufficient funds!");
            return;
        }
        user.setBalance(user.getBalance() - totalAmount);
        System.out.println("Success");
    }

    @Override
    public void fundUser(User user, int amount) {
        if (amount >= user.getBank().getLimitOfFunding()) {
            System.out.println("Funding error! " + user.getName() + ": Funding limit exceeded!");
            return;
        }
        user.setBalance(user.getBalance() + amount);
        System.out.println("Success!");
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double totalAmount = amount + fromUser.getBank().getCommission(amount);

        if (fromUser.equals(toUser)) {
            System.out.println("Invalid transfer parameters! Cannot transfer to oneself");
            return;
        }
        if (totalAmount >= fromUser.getBank().getLimitOfWithdrawal()) {
            System.out.println("Transfer error! " + fromUser.getName() + ": Withdrawal limit exceeded!");
            return;
        }
        if (totalAmount >= fromUser.getBalance()) {
            System.out.println("Transfer error! " + fromUser.getName() + ": Insufficient funds!");
            return;
        }
        if (totalAmount >= toUser.getBank().getLimitOfFunding()) {
            System.out.println("Transfer error! " + toUser.getName() + ": Funding limit exceeded!");
            return;
        }
        fromUser.setBalance(fromUser.getBalance() - totalAmount);
        toUser.setBalance(toUser.getBalance() + totalAmount);
        System.out.println("Success!");
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
        System.out.println("Success!");
    }
}
