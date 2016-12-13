public class Father extends Handler{
    public Father(){
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    public void response(IWomen women){
        System.out.println("--------Dauthter request to father--------");
        System.out.println(women.getRequest());
        System.out.println("Response from father: agree.\n");
    }
}