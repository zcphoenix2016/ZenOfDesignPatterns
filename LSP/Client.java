public class Client{
    public static void main(String[] args){
        Soldier sanMao = new Soldier();
        sanMao.setGun(new Rifle());
        sanMao.killEnemy();
    }
};
