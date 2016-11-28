public class NvWa{
    public static void main(String[] args){
        AbstractHumanFactory YinYangLu = new HumanFactory();

        System.out.println("--WhiteHuman created--");
        Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        System.out.println("--BlackHuman created--");
        Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        System.out.println("--YellowHuman created--");
        Human yellowHuman = YinYangLu.createHuman(WhiteHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
