public class Zhaoyun{
    public static void main(String[] args){
        Context context;

        System.out.println("----The first strategy----");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("\n");

        System.out.println("----The second strategy----");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("\n");

        System.out.println("----The third strategy----");
        context = new Context(new BlockEnemy());
        context.operate();
        System.out.println("\n");
    }
}
