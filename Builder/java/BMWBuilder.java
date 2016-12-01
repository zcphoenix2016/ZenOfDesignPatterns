import java.util.ArrayList;

public class BMWBuilder extends CarBuilder{
    private ArrayList<String> sequence = new ArrayList<String>();

    public CarModel getCarModel(){
        BMWModel bmw = new BMWModel();
        bmw.setSequence(this.sequence);
        return bmw;
    }

    public void setSequence(ArrayList<String> sequence){
        this.sequence = (ArrayList<String>)sequence.clone();
    }
}
