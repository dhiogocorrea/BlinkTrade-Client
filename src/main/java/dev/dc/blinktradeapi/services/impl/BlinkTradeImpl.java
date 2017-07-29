package dev.dc.blinktradeapi.services.impl;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import dev.dc.blinktradeapi.entitites.Orderbook;
import dev.dc.blinktradeapi.entitites.Ticker;
import dev.dc.blinktradeapi.entitites.Trade;
import dev.dc.blinktradeapi.enumerators.CriptoCurrency;
import dev.dc.blinktradeapi.enumerators.Currency;
import dev.dc.blinktradeapi.httputils.OkHttpRequests;
import dev.dc.blinktradeapi.services.BlinkTrade;
import java.io.IOException;

public class BlinkTradeImpl implements BlinkTrade {

    Gson GSON;
    OkHttpClient client;

    private static final String URL = "https://api.blinktrade.com/api/v1/";

    public BlinkTradeImpl() {
        GSON = new Gson();
        client = new OkHttpClient();
    }

    @Override
    public Ticker ticker(Currency currency) throws IOException {
        return ticker(currency, null);
    }

    @Override
    public Ticker ticker(Currency currency, CriptoCurrency cripto_currency) 
        throws IOException {
        String curr = currency == null ? Currency.BRL.name() : currency.name();
        String cripto = cripto_currency == null ? CriptoCurrency.BTC.name() : cripto_currency.name();

        String url = URL + curr + "/ticker?cripto_currency=" + cripto;

        String response = OkHttpRequests.doGetRequest(client, url);
        
        return GSON.fromJson(response, Ticker.class);
    }

    @Override
    public Orderbook orderbook(Currency currency) throws IOException {
        return orderbook(currency, null);
    }

    @Override
    public Orderbook orderbook(Currency currency, 
            CriptoCurrency cripto_currency) throws IOException {
        String curr = currency == null ? Currency.BRL.name() : currency.name();
        String cripto = cripto_currency == null ? CriptoCurrency.BTC.name() : cripto_currency.name();

        String url = URL + curr + "/orderbook?cripto_currency=" + cripto;

        String response = OkHttpRequests.doGetRequest(client, url);
        
        return GSON.fromJson(response, Orderbook.class);
    }

    @Override
    public Trade[] trades(Currency currency) throws IOException {
        return trades(currency, null, 0, 0);
    }

    @Override
    public Trade[] trades(Currency currency, CriptoCurrency cripto_currency,
            long since, int limit) throws IOException {
        String curr = currency == null ? Currency.BRL.name() : currency.name();
        String cripto = cripto_currency == null ? CriptoCurrency.BTC.name() : cripto_currency.name();

        String url = URL + curr + "/trades?cripto_currency=" + cripto;

        if (since > 0) {
            url += "&since=" + since;
        }
        if (limit > 0) {
            url += "&limit=" + limit;
        }
        
        String response = OkHttpRequests.doGetRequest(client, url);
        
        return GSON.fromJson(response, Trade[].class);
    }

    @Override
    public Trade[] trades(Currency currency, long since, 
            int limit) throws IOException {
        return trades(currency, null, since, limit);
    }

    @Override
    public Trade[] trades(Currency currency, int limit) throws IOException {
        return trades(currency, null, 0, limit);
    }

    @Override
    public Trade[] trades(Currency currency, 
            CriptoCurrency cripto_currency) throws IOException {
        return trades(currency, cripto_currency, 0, 0);
    }

    @Override
    public Trade[] trades(Currency currency, CriptoCurrency cripto_currency,
            long since) throws IOException {
        return trades(currency, cripto_currency, since, 0);
    }

    @Override
    public Trade[] trades(Currency currency, CriptoCurrency cripto_currency, int limit) throws IOException {
        return trades(currency, cripto_currency, 0, limit);
    }

}
