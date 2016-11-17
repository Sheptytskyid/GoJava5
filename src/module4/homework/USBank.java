package module4.homework;

import java.util.concurrent.CyclicBarrier;

public class USBank extends Bank {

    private String name;

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee,
                  long rating, long totalCapital, String name) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
        this.name = name;
    }

    @Override
    public int getLimitOfWithdrawal() {
        switch (super.getCurrency()) {
            case USD:
                return 1000;
            case EUR:
                return 1200;
        }
        return 0;
    }

    @Override
    public int getLimitOfFunding() {
        switch (super.getCurrency()) {
            case USD:
                return Integer.MAX_VALUE;
            case EUR:
                return 10000;
        }
        return 0;
    }

    @Override
    public int getMonthlyRate() {
        switch (super.getCurrency()) {
            case USD:
                return 1;
            case EUR:
                return 2;
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
                    return sum * 0.06;
                } else {
                    return sum * 0.08;
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