package dev.dc.blinktradeapi.entitites;

public class Trade {

    long tid;
    long date;
    double price;
    double amount;
    String side;
    
    public Trade(){
        
    }

    public Trade(long tid, long date, double price, double amount, String side) {
        this.tid = tid;
        this.date = date;
        this.price = price;
        this.amount = amount;
        this.side = side;
    }

    public long getTid() {
        return tid;
    }

    public void setTid(long tid) {
        this.tid = tid;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }
    
    
}
