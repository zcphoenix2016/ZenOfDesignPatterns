public class Son extends Handler{
    public Son(){
        super(Handler.SON_LEVEL_REQUEST);
    }

    public void response(IWomen women){
        System.out.println("--------Mather request to son--------");
        System.out.println(women.getRequest());
        System.out.println("Response from son: agree.\n");
    }
}