package s302_N1;

public class Main {
    public static void main(String[] args) {
        StockExchangeAgent_Observable stockExchangeAgent = new StockExchangeAgent_Observable();
        StockExchangeAgency agency1 = new StockExchangeAgency("ITAcademy");
        StockExchangeAgency agency2 = new StockExchangeAgency("Cibernarium");
        StockExchangeAgency agency3 = new StockExchangeAgency("Barcelona Activa");

        stockExchangeAgent.addAgency(agency1);
        stockExchangeAgent.addAgency(agency2);
        stockExchangeAgent.addAgency(agency3);

        stockExchangeAgent.setStockPrice(80.5);
        stockExchangeAgent.setStockPrice(22.6);

    }
}
