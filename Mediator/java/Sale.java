import java.util.Random;

public class Sale extends AbstractColleague{
    public Sale(AbstractMediator mediator){
        super(mediator);
    }

    public void sellComputer(int number){
        super.mediator.execute("sale.sell", number);
        System.out.println("Sell number of computers: " + number);
    }

    public int getSaleStatus(){
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("Sale status: " + saleStatus);
        return saleStatus;
    }

    public void offSale(){
        super.mediator.execute("sale.offSale");
    }
}