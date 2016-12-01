public class BMWModel extends CarModel{
    protected void alarm(){
        System.out.println("BMWModel is alarming...");
    }

    protected void engineBoom(){
        System.out.println("BMWModel's engine is booming...");
    }

    protected void start(){
        System.out.println("BMWModel started.");
    }

    protected void stop(){
        System.out.println("BMWModel stopped.");
    }
}