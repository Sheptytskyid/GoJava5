package moduleThree.practice;

public class CurrencyConverter {

    private double rate;

    public CurrencyConverter(double rate) {
        this.rate = rate;
    }

    double convert(double sumInUAH) {
        double sumInUSD = sumInUAH / rate;
        return sumInUSD;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
