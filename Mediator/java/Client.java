public class Client{

    public static void main(String[] args){
        AbstractMediator mediator = new Mediator();

        System.out.println("------Purchase computers------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyComputer(100);

        System.out.println("\n------Sell computers------");
        Sale sale = new Sale(mediator);
        sale.sellComputer(1);

        System.out.println("\n------Clear stock------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}