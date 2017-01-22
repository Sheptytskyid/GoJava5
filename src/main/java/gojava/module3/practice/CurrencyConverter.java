package gojava.module3.practice;

public class CurrencyConverter {

    private double rate;

    public CurrencyConverter(double rate) {
        this.rate = rate;
    }

    double convert(double sumInUah) {
        double sumInUsd = sumInUah / rate;
        return sumInUsd;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
