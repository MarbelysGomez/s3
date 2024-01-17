package s302_N1;

public class StockExchangeAgency implements StockExchange_Observer{
    private String name;

    public StockExchangeAgency(String name) {
        this.name = name;
    }
    @Override
    public void update(double oldStockPrice, double newStockPrice) {
        System.out.println("Agency " + this.name + ", has been notified about stock price change: from " +
                oldStockPrice + " to " + newStockPrice + ".");
    }
}
