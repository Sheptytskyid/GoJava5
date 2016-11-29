package gojava.module4.homework;

public class ChinaBank extends Bank {

    private String name;

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee,
                     long rating, long totalCapital, String name) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
        this.name = name;
    }

    @Override
    public int getLimitOfWithdrawal() {
        switch (super.getCurrency()) {
            case USD:
                return 100;
            case EUR:
                return 150;
            default:
                return 0;
        }
    }

    @Override
    public int getLimitOfFunding() {
        switch (super.getCurrency()) {
            case USD:
                return 10000;
            case EUR:
                return 5000;
            default:
                return 0;
        }
    }

    @Override
    public int getMonthlyRate() {
        switch (super.getCurrency()) {
            case USD:
                return 1;
            case EUR:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public double getCommission(int sum) {
        switch (super.getCurrency()) {
            case USD:
                if (sum <= 1000) {
                    return sum * 0.03;
                } else {
                    return sum * 0.05;
                }
            case EUR:
                if (sum <= 1000) {
                    return sum * 0.1;
                } else {
                    return sum * 0.11;
                }
            default:
                return 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
