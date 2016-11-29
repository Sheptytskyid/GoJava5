package gojava.module3.homework.task4;

public class User {

    private String name;
    private String companyName;
    private String currency;
    private int balance;
    private int monthsOfEmployment;
    private int salary;

    public User(String name, String companyName, String currency, int balance, int monthsOfEmployment, int salary) {
        this.name = name;
        this.companyName = companyName;
        this.currency = currency;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public int getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void paySalary() {
        this.balance += this.salary;
    }

    public void withdraw(int summ) {
        if (summ < 1000) {
            summ *= 1.05;
        } else {
            summ *= 1.1;
        }

        if (this.balance >= summ) {
            this.balance -= summ;
        } else {
            System.out.println("Withdrawal failed!\nInsufficient funds!");
        }
    }

    int companyNameLength() {
        return this.companyName.length();
    }

    void monthIncreaser(int addMonth) {
        this.monthsOfEmployment += addMonth;
    }
}
