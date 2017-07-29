package dev.dc.brlinktradepi.app;

import dev.dc.blinktradeapi.entitites.Orderbook;
import dev.dc.blinktradeapi.entitites.Ticker;
import dev.dc.blinktradeapi.entitites.Trade;
import dev.dc.blinktradeapi.enumerators.Currency;
import dev.dc.blinktradeapi.services.BlinkTrade;
import dev.dc.blinktradeapi.services.impl.BlinkTradeImpl;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BlinkTrade blinktrade = new BlinkTradeImpl();
        Ticker ticker = blinktrade.ticker(Currency.BRL);
        Orderbook orderbook = blinktrade.orderbook(Currency.BRL);
        Trade[] trades = blinktrade.trades(Currency.BRL);
        
        System.out.println("Ticker: ");
        System.out.println("High: "+ ticker.getHigh());
        System.out.println("Low: "+ ticker.getLow());
        System.out.println("Last: "+ ticker.getLast());
        System.out.println("Sell: "+ ticker.getSell());
        System.out.println("Buy: "+ ticker.getBuy());
        System.out.println("Vol: "+ ticker.getVol());
        System.out.println("Vol_BRL: "+ ticker.getVol_brl());
        System.out.println("=================================");
    }
}
