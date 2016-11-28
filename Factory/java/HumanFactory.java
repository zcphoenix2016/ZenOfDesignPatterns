public class HumanFactory extends AbstractHumanFactory{
    public <T extends Human> T createHuman(Class<T> c){
        Human human = null;
        try{
            human = (T)Class.forName(c.getName()).newInstance();
        }catch(Exception e){
            System.out.println("Error of createHuman...");
        }

        return (T)human;
    }
}
