public class NvWa{
    public static void main(String[] args){
        HumanFactory maleHumanFactory = new MaleHumanFactory();
        HumanFactory femaleHumanFactory = new FemaleHumanFactory();
        
        System.out.println("FemaleYellowHuman created.");
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        femaleYellowHuman.getColor();
        femaleYellowHuman.getSex();
        femaleYellowHuman.talk();

        System.out.println("MaleYellowHuman created.");
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        maleYellowHuman.getColor();
        maleYellowHuman.getSex();
        maleYellowHuman.talk();
    }
}