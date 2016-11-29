package moduleFour.homework;

public class EUBank extends Bank {

    private String name;

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee,
                  long rating, long totalCapital, String name) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
        this.name = name;
    }

    @Override
    public int getLimitOfWithdrawal() {
        switch (super.getCurrency()) {
            case USD:
                return 2000;
            case EUR:
                return 2200;
        }
        return 0;
    }

    @Override
    public int getLimitOfFunding() {
        switch (super.getCurrency()) {
            case USD:
                return 10000;
            case EUR:
                return 20000;
        }
        return 0;
    }

    @Override
    public int getMonthlyRate() {
        switch (super.getCurrency()) {
            case USD:
                return 0;
            case EUR:
                return 1;
        }
        return 0;
    }

    @Override
    public double getCommission(int sum) {
        switch (super.getCurrency()) {
            case USD:
                if (sum <= 1000) {
                    return sum * 0.05;
                } else {
                    return sum * 0.07;
                }
            case EUR:
                if (sum <= 1000) {
                    return sum * 0.02;
                } else {
                    return sum * 0.04;
                }
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
