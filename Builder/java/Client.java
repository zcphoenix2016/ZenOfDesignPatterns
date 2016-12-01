import java.util.ArrayList;

public class Client{
    public static void main(String[] args){
        Director director = new Director();

        BenzModel benA = director.getBenzAModel();
        BenzModel benB = director.getBenzBModel();
        BMWModel bmwA = director.getBMWAModel();
        BMWModel bmwB = director.getBMWBModel();

        benA.run();
        benB.run();
        bmwA.run();
        bmwB.run();
    }
}