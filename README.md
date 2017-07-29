# BlinkTrade Client
BlinkTrade API Wrapper in Java

### How to use: 

1. Create an instance:
```java
BlinkTrade blinktrade = new BlinkTradeImpl();
```

2. Access to ticker, orderbook and trades:
```java
Ticker ticker = blinktrade.ticker(Currency.BRL);
Orderbook orderbook = blinktrade.orderbook(Currency.BRL);
Trade[] trades = blinktrade.trades(Currency.BRL);
```

For now, only Public API is available. Trade API implementation comming soon. Feel free to help!

------------------------------------------------------------------------------------------------------

For more information, refer to the [oficial API documentation](https://blinktrade.com/docs/)

##### Buy me a coffee! :) Bitcoin wallet: 19MYBsERBC85xwoDzEA7xsZcwNcUR4foY6

##### Made with S2 for bitcoin S2ers.
