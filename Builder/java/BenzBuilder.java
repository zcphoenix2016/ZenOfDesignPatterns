import java.util.ArrayList;

public class BenzBuilder extends CarBuilder{
    private ArrayList<String> sequence = new ArrayList<String>();

    public CarModel getCarModel(){
        BenzModel benz = new BenzModel();
        benz.setSequence(this.sequence);
        return benz;
    }

    public void setSequence(ArrayList<String> sequence){
        this.sequence = (ArrayList<String>)sequence.clone();
    }
}