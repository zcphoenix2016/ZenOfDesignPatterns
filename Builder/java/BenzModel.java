public class BenzModel extends CarModel{
    protected void alarm(){
        System.out.println("BenzModel is alarming...");
    }

    protected void engineBoom(){
        System.out.println("BenzModel's engine is booming...");
    }

    protected void start(){
        System.out.println("BenzModel started.");
    }

    protected void stop(){
        System.out.println("BenzModel stopped.");
    }
}