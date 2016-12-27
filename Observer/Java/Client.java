public class Client{
    public static void main(String[] args){
        Observer lisi = new LiSi();
        Observer wangsi = new WangSi();
        HanFeiZi hanfeizi = new HanFeiZi();

        hanfeizi.addObserver(lisi);
        hanfeizi.addObserver(wangsi);

        hanfeizi.haveBreakfast();
    }
}
