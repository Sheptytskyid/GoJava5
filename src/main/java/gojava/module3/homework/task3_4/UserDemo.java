package gojava.module3.homework.task3_4;

public class UserDemo {

    public static void main(String[] args) {
        User Sheptytskyid = new User("Denys Sheptytskyi", "OTP Capital", "UAH", 1_000, 8 * 12 + 10, 100);

        Sheptytskyid.setCompanyName("LLC \"AMC \"OTP Capital\"");


        System.out.println("User: " + Sheptytskyid.getName());
        System.out.println("Employer: " + Sheptytskyid.getCompanyName() + " (" + Sheptytskyid.companyNameLength()
                            + " chars)");
        System.out.println("Term of employment: " + Sheptytskyid.getMonthsOfEmployment() + " months");
        System.out.println("Account balance before salary: " + Sheptytskyid.getBalance());
        System.out.println("Salary: " + Sheptytskyid.getSalary());
        Sheptytskyid.paySalary();
        Sheptytskyid.monthIncreaser(1);
        System.out.println("Account balance after salary: " + Sheptytskyid.getBalance());
        System.out.println("New term of employment: " + Sheptytskyid.getMonthsOfEmployment() + " months");
        int withdrawal = 1000;
        Sheptytskyid.withdraw(withdrawal);
        System.out.println("Account balance after withdrawing " + Sheptytskyid.getCurrency() + " "
                            + withdrawal + ": " + Sheptytskyid.getBalance());
    }
}
