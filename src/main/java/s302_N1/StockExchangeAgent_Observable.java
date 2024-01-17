package s302_N1;

import java.util.ArrayList;
import java.util.List;

public class StockExchangeAgent_Observable {
    private double stockPrice;
    private List<StockExchangeAgency> observerList;

    public StockExchangeAgent_Observable() {
        this.stockPrice = stockPrice;
        this.observerList = new ArrayList<>();
    }
    public double getStockPrice() {
        return this.stockPrice;
    }
    public List<StockExchangeAgency> getObserverList() {
        return this.observerList;
    }
    public void setStockPrice(double newStockPrice) {
        if (this.stockPrice != newStockPrice) {
            double oldStockPrice = this.stockPrice;
            this.stockPrice = newStockPrice;
            this.notifyAgencies(oldStockPrice, newStockPrice);
        }
    }
    public void setObserverList(List<StockExchangeAgency> observerList) {
        this.observerList = observerList;
    }

    public void addAgency(StockExchangeAgency agencyObserver ) {
        this.observerList.add(agencyObserver);
    }

    public void removeAgency(StockExchangeAgency agencyObserver) {
        this.observerList.remove(agencyObserver);
    }
    public void notifyAgencies(double oldStockPrice, double newStockPrice) {
        for (StockExchangeAgency agencyObserver : observerList) {
            agencyObserver.update(oldStockPrice, newStockPrice);
        }
    }
}
