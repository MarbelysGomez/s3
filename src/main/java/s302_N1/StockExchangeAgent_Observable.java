package s302_N1;

import java.util.ArrayList;
import java.util.List;

public class StockExchangeAgent_Observable {
    private double stockPrice;
    private List<StockExchangeAgency_Observer> observerList;

    public StockExchangeAgent_Observable() {
        this.stockPrice = stockPrice;
        this.observerList = new ArrayList<>();
    }
    public List<StockExchangeAgency_Observer> getObserverList() {
        return this.observerList;
    }
    public double getStockPrice() {
        return this.stockPrice;
    }
    public void setObserverList(List<StockExchangeAgency_Observer> observerList) {
        this.observerList = observerList;
    }
    public void setStockPrice(double newStockPrice) {
        this.stockPrice = newStockPrice;
        this.notifyAgencies();
    }
    public void addAgency(StockExchangeAgency_Observer agencyObserver ) {
        this.observerList.add(agencyObserver);
    }

    public void removeAgency(StockExchangeAgency_Observer agencyObserver) {
        this.observerList.remove(agencyObserver);
    }
    public void notifyAgencies() {
        for (StockExchangeAgency_Observer agencyObserver : this.observerList) {
            agencyObserver.update(this.stockPrice);
        }
    }
}
