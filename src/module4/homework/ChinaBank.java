package module4.homework;

public class ChinaBank extends Bank {

    private String name;

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee,
                     long rating, long totalCapital, String name) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
        this.name = name;
    }

    @Override
    public int getLimitOfWithdrawal() {
        int limitOfWithdrawal = 0;

        switch (super.getCurrency()) {
            case USD:
                limitOfWithdrawal = 100;
                break;
            case EUR:
                limitOfWithdrawal = 150;
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
                limitOfFunding = 5_000;
                break;
        }

        return limitOfFunding;
    }

    @Override
    public int getMonthlyRate() {
        int monthlyRate = 0;

        switch (super.getCurrency()) {
            case USD:
                monthlyRate = 1;
                break;
            case EUR:
                monthlyRate = 0;
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
                    commission = 3;
                } else {
                    commission = 5;
                }
                break;
            case EUR:
                if (sum <= 1000) {
                    commission = 10;
                } else {
                    commission = 11;
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
