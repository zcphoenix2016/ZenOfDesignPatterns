public class Client{
    public static void main(String[] args){
        Soldier s1 = new Soldier();
        Soldier s2 = new Soldier();
        Soldier s3 = new Soldier();

        s1.setGun(new HandGun());
        s2.setGun(new Rifle());
        s3.setGun(new MachineGun());

        s1.killEnemy();
        s2.killEnemy();
        s3.killEnemy();
    }
};
