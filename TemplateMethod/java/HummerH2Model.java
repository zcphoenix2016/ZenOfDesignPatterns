public class HummerH2Model extends HummerModel{
    @Override
    public void alarm(){
        System.out.println("Hummer-H2 is alarming...");
    }

    @Override
    public void engineBoom(){
        System.out.println("Hummer-H2 engine is booming...");
    }

    @Override
    public void start(){
        System.out.println("Hummer-H2 started.");
    }

    @Override
    public void stop(){
        System.out.println("Hummer-H2 stopped.");
    }
}