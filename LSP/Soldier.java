public class Soldier{
    private AbstractGun gun;

    public void setGun(AbstractGun _gun){
        this.gun = _gun;
    }

    public void killEnemy(){
        System.out.println("Solider killing enemy ...");
        gun.shoot();
    }
};
