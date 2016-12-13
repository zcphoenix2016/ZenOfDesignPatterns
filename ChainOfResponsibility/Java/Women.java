public class Women implements IWomen{
    private int type = 0;
    private String request = "";

    public Women(int type, String request){
        this.type = type;
        switch(this.type){
            case 1:
                this.request = "Request from daughter: " + request;
                break;
            case 2:
                this.request = "Request from wife: " + request;
                break;
            case 3:
                this.request = "Request from mather: " + request;
                break;
        }
    }

    public int getType(){
        return this.type;
    }

    public String getRequest(){
        return this.request;
    }
}