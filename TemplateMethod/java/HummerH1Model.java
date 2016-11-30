public class HummerH1Model extends HummerModel{
    @Override
    public void alarm(){
        System.out.println("Hummer-H1 is alarming...");
    }

    @Override
    public void engineBoom(){
        System.out.println("Hummer-H1 engine is booming...");
    }

    @Override
    public void start(){
        System.out.println("Hummer-H1 started.");
    }

    @Override
    public void stop(){
        System.out.println("Hummer-H1 stopped.");
    }
}