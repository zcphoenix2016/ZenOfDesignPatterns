public class Client{
    public static void main(String[] args){
        IDriver d1 = new Driver();
        IDriver d2 = new Driver();

        ICar benz = new Benz();
        ICar bmw = new BMW();

        d1.drive(benz);
        d2.drive(bmw);
    }
}
