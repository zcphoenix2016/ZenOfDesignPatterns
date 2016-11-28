public class Client{
    public static void main(String[] args){
        for(int day = 0; day < 3; day ++){
            Singleton singleton = Singleton.getInstance();
            singleton.say();
        }
    }
}
