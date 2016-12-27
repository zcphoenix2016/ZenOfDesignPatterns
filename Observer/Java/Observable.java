import java.util.Vector;

public abstract class Observable{
    private Vector<Observer> obsVector = new Vector<Observer>();

    public void addObserver(Observer o){
        this.obsVector.add(o);
    }

    public void deleteObserver(Observer o){
        this.obsVector.remove(o);
    }

    public void notifyObservers(String str){
        for(Observer o : this.obsVector){
            o.update(str);
        }
    }
}
