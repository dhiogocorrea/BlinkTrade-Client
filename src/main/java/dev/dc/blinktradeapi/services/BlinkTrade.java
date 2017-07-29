package dev.dc.blinktradeapi.services;

import dev.dc.blinktradeapi.entitites.Orderbook;
import dev.dc.blinktradeapi.entitites.Ticker;
import dev.dc.blinktradeapi.entitites.Trade;
import dev.dc.blinktradeapi.enumerators.CriptoCurrency;
import dev.dc.blinktradeapi.enumerators.Currency;
import java.io.IOException;

/**
 * Reference: https://blinktrade.com/docs/#public-rest-api
 * @author Dhiogo
 */
public interface BlinkTrade {
    
    /**
     * Ticker is a summary information about the current status of an exchange
     * @param currency
     * @return pair, last, high, low, vol, vol_brl, buy, sell
     * @throws IOException 
     */
    Ticker ticker(Currency currency) throws IOException;
    /**
     * Ticker is a summary information about the current status of an exchange
     * @param currency
     * @param cripto_currency Crypto currency to be used. Optional; defaults to BTC
     * @return pair, last, high, low, vol, vol_brl, buy, sell
     * @throws IOException 
     */
    Ticker ticker(Currency currency, CriptoCurrency cripto_currency)
            throws IOException;
    
    /**
     * Order book is a list of orders that shows the interest of buyers (bids) and sellers (asks).
     * @param currency
     * @return pair, bids and asks
     * @throws IOException 
     */
    Orderbook orderbook(Currency currency) throws IOException;
    
    /**
     * Order book is a list of orders that shows the interest of buyers (bids) and sellers (asks).
     * @param currency
     * @param cripto_currency Crypto currency to be used. Optional; defaults to BTC
     * @return pair, bids and asks
     * @throws IOException 
     */
    Orderbook orderbook(Currency currency, CriptoCurrency cripto_currency)
            throws IOException;
    
    Trade[] trades(Currency currency) throws IOException;
    /**
     * A list of the last trades executed on an exchange since a chosen date.
     * @param currency
     * @param cripto_currency Crypto currency to be used. Optional; defaults to BTC
     * @param since Date which executed trades must be fetched from. <TIMESTAMP> is in 
     * Unix Time date format. Optional; defaults to the date of the first executed trade
     * @param limit Limit of trades that will be returned. <NUMBER> should be a 
     * positive integer. Optional; defaults to 100 trades
     * @return array with: tid, date, price, amount and side
     * @throws IOException 
     */
    Trade[] trades(Currency currency, CriptoCurrency cripto_currency, 
            long since, int limit) throws IOException;
    Trade[] trades(Currency currency, long since, int limit)
            throws IOException;
    Trade[] trades(Currency currency, int limit) throws IOException;
    Trade[] trades(Currency currency, CriptoCurrency cripto_currency)
            throws IOException;
    Trade[] trades(Currency currency, CriptoCurrency cripto_currency, 
            long since) throws IOException;
    Trade[] trades(Currency currency, CriptoCurrency cripto_currency,
            int limit) throws IOException;
}
