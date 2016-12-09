public class Purchase extends AbstractColleague{
    public Purchase(AbstractMediator mediator){
        super(mediator);
    }

    public void buyComputer(int number){
        super.mediator.execute("purchase.buy", number);
    }

    public void refuseBuyComputer(){
        System.out.println("Refuse to buy new computers.");
    }
}