public class Mediator extends AbstractMediator{

    public void execute(String str, Object... objects){
        if(str.equals("purchase.buy")){
            this.buyComputer((Integer)objects[0]);
        }
        else if(str.equals("sale.sell")){
            this.sellComputer((Integer)objects[0]);
        }
        else if(str.equals("sale.offSale")){
            this.offSale();
        }
        else if(str.equals("stock.clear")){
            this.clearStock();
        }
    }

    private void buyComputer(int number){
        int saleStatus = super.sale.getSaleStatus();
        if(80 < saleStatus){
            System.out.println("Buy number of computers: " + number);
            super.stock.increase(number);
        }
        else{
            System.out.println("Buy number of computers: " + number / 2);
            super.stock.increase(number / 2);
        }
    }

    private void sellComputer(int number){
        if(super.stock.getStockNumber() < number){
            super.purchase.buyComputer(number);
        }
        super.stock.decrease(number);
    }

    private void offSale(){
        System.out.println("Off sell number of computers: " + super.stock.getStockNumber());
    }

    private void clearStock(){
        super.sale.offSale();
        super.purchase.refuseBuyComputer();
    }
}