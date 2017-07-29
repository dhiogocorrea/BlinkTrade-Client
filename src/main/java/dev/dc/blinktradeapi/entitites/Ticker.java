package dev.dc.blinktradeapi.entitites;

public class Ticker {

    String pair;
    double last;
    double high;
    double low;
    double vol;
    double vol_brl;
    double buy;
    double sell;
    
    public Ticker() {
    }

    public Ticker(String pair, double last, double high, double low, double vol, double vol_brl, double buy, double sell) {
        this.pair = pair;
        this.last = last;
        this.high = high;
        this.low = low;
        this.vol = vol;
        this.vol_brl = vol_brl;
        this.buy = buy;
        this.sell = sell;
    }

    public String getPair() {
        return pair;
    }

    public void setPair(String pair) {
        this.pair = pair;
    }

    public double getLast() {
        return last;
    }

    public void setLast(double last) {
        this.last = last;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getVol() {
        return vol;
    }

    public void setVol(double vol) {
        this.vol = vol;
    }

    public double getVol_brl() {
        return vol_brl;
    }

    public void setVol_brl(double vol_brl) {
        this.vol_brl = vol_brl;
    }

    public double getBuy() {
        return buy;
    }

    public void setBuy(double buy) {
        this.buy = buy;
    }

    public double getSell() {
        return sell;
    }

    public void setSell(double sell) {
        this.sell = sell;
    }
    
    
}
