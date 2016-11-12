package module4.homework;

public class EUBank extends Bank {

    private String name;

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee,
                  long rating, long totalCapital, String name) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
        this.name = name;
    }

    @Override
    public int getLimitOfWithdrawal() {
        int limitOfWithdrawal = 0;

        switch (super.getCurrency()) {
            case USD:
                limitOfWithdrawal = 2_000;
                break;
            case EUR:
                limitOfWithdrawal = 2_200;
                break;
        }

        return limitOfWithdrawal;
    }

    @Override
    public int getLimitOfFunding() {
        int limitOfFunding = 0;

        switch (super.getCurrency()) {
            case USD:
                limitOfFunding = 10_000;
                break;
            case EUR:
                limitOfFunding = 20_000;
                break;
        }

        return limitOfFunding;
    }

    @Override
    public int getMonthlyRate() {
        int monthlyRate = 0;

        switch (super.getCurrency()) {
            case USD:
                monthlyRate = 0;
                break;
            case EUR:
                monthlyRate = 1;
                break;
        }

        return monthlyRate;
    }

    @Override
    public int getCommission(int sum) {
        int commission = 0;

        switch (super.getCurrency()) {
            case USD:
                if (sum <= 1000) {
                    commission = 5;
                } else {
                    commission = 7;
                }
                break;
            case EUR:
                if (sum <= 1000) {
                    commission = 2;
                } else {
                    commission = 4;
                }
                break;
        }
        return commission;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
