package s302_N1;

public class Main {
    public static void main(String[] args) {
        StockExchangeAgent_Observable stockExchangeAgent = new StockExchangeAgent_Observable();
        StockExchangeAgency_Observer agency1 = new StockExchangeAgency_Observer("ITAcademy");
        StockExchangeAgency_Observer agency2 = new StockExchangeAgency_Observer("Cibernarium");
        StockExchangeAgency_Observer agency3 = new StockExchangeAgency_Observer("Barcelona Activa");

       stockExchangeAgent.addAgency(agency1);
       stockExchangeAgent.addAgency(agency2);
       stockExchangeAgent.addAgency(agency3);

       stockExchangeAgent.setStockPrice(80.5);
       stockExchangeAgent.setStockPrice(22.6);

    }
}
