package s302_N1;

public class StockExchangeAgency_Observer {
    private String name;

    public StockExchangeAgency_Observer(String name) {
        this.name = name;
    }

    public void update(double newStockPrice) {
        System.out.println("Agency " + this.name + ", has been notified about new stock price: " + newStockPrice + ".");
    }
}
