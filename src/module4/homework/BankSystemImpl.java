package module4.homework;

public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        double totalAmount = amount * (1 + user.getBank().getCommission(amount) / 100);

        if (totalAmount >= user.getBank().getLimitOfWithdrawal()) {
            System.out.println("Withdrawal error: Limit exceeded!");
            return;
        }
        if (totalAmount >= user.getBalance()) {
            System.out.println("Withdrawal error: insufficient funds!");
            return;
        }

        double newBalance = user.getBalance() - totalAmount;
        user.setBalance(newBalance);
        System.out.println("Success");
    }

    @Override
    public void fundUser(User user, int amount) {
        if (amount >= user.getBank().getLimitOfFunding()) {
            System.out.println("Funding error! " + user.getName() + ": Funding limit exceeded!");
            return;
        }

        double newBalance = user.getBalance() + amount;
        user.setBalance(newBalance);
        System.out.println("Success!");
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double totalAmount = amount * (1 + fromUser.getBank().getCommission(amount) / 100);

        if (fromUser == toUser) {
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

        double fromUserNewBalance = fromUser.getBalance() - totalAmount;
        double toUserNewBalance = toUser.getBalance() + totalAmount;

        fromUser.setBalance(fromUserNewBalance);
        toUser.setBalance(toUserNewBalance);
        System.out.println("Success!");
    }

    @Override
    public void paySalary(User user) {
        double userNewBalance = user.getBalance() + user.getSalary();
        user.setBalance(userNewBalance);
        System.out.println("Success!");
    }
}