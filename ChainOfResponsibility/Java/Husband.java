public class Husband extends Handler{
    public Husband(){
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    public void response(IWomen women){
        System.out.println("--------Wife request to husband--------");
        System.out.println(women.getRequest());
        System.out.println("Response from husband: agree.\n");
    }
}