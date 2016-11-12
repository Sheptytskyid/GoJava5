package module4.homework;

public class Main {

    public static void main(String[] args) {
        ChinaBank chinBan = new ChinaBank(000000, "China", Currency.USD, 1000, 112, 5, 500000, "ChinBan");
        EUBank raiffeisenBank = new EUBank(111111, "Austria", Currency.EUR, 800, 115, 4, 400000, "Raiffeisen Bank");
        USBank bankOfAmerica = new USBank(222222, "US", Currency.USD, 600, 119, 3, 300000, "Bank Of America");

        User[] users = new User[6];
        users[0] = new User(65535, "Denys Sheptytskyi", 2000.0, 106, "LLC \"AMC \"OTP Capital\"", 100, raiffeisenBank);
        users[1] = new User(45454, "Roman Syrota", 5000.0, 12, "LLC \"Amigo\"", 50, raiffeisenBank);
        users[2] = new User(42783, "Orest Mudrak", 1000.0, 24, "LLC \"New Technologies\"", 180, bankOfAmerica);
        users[3] = new User(18263, "Petro Kozak", 3000.0, 18, "LLC \"Open Source\"", 160, bankOfAmerica);
        users[4] = new User(93714, "Vasyl Shkolnyi", 50.0, 2, "LLC \"Vesta\"", 109, chinBan);
        users[5] = new User(32825, "Diana Gupalo", 30.0, 10, "LLC \"Office Solutions\"", 155, chinBan);
        BankSystemImpl system1 = new BankSystemImpl();

        System.out.println("Users' objects:");
        for (User user : users) {
            System.out.println(user.toString());
            System.out.println("\n");
        }

        System.out.println("============================================\n");

        for (User user : users) {
            int fundingAmount = 200;
            int transferAmount = 1000;
            int withdrawAmount = 2000;
            System.out.println("Performing operations with user " + user.getName());
            System.out.println("Funding " + user.getBank().getCurrency() + " " + fundingAmount);
            system1.fundUser(user, fundingAmount);
            System.out.println("Transferring " + user.getBank().getCurrency() + " " + transferAmount);
            system1.transferMoney(user, users[4], transferAmount);
            System.out.println("Paying Salary " + user.getBank().getCurrency() + " " + user.getSalary());
            system1.paySalary(user);
            System.out.println("Withdrawing " + user.getBank().getCurrency() + " " + withdrawAmount);
            system1.withdrawOfUser(user, withdrawAmount);
            System.out.println("Balance: " + user.getBank().getCurrency() + " " + user.getBalance());
            System.out.println("\n");
        }
    }
}