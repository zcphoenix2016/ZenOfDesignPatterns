public class HanFeiZi extends Observable implements IHanFeiZi{
    public void haveBreakfast(){
        System.out.println("breakfast.");
        super.notifyObservers("breakfast");
    }

    public void haveFun(){
        System.out.println("fun.");
        super.notifyObservers("fun");
    }
}
