package dev.dc.blinktradeapi.entitites;

import java.util.List;

public class Orderbook {

    String pair;
    List<List<Double>> bids;
    List<List<Double>> asks;
    
    public Orderbook(){
        
    }

    public Orderbook(String pair, List<List<Double>> bids, List<List<Double>> asks) {
        this.pair = pair;
        this.bids = bids;
        this.asks = asks;
    }

    public String getPair() {
        return pair;
    }

    public void setPair(String pair) {
        this.pair = pair;
    }

    public List<List<Double>> getBids() {
        return bids;
    }

    public void setBids(List<List<Double>> bids) {
        this.bids = bids;
    }

    public List<List<Double>> getAsks() {
        return asks;
    }

    public void setAsks(List<List<Double>> asks) {
        this.asks = asks;
    }
}
