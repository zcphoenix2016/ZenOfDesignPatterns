public class Client{
    public static void main(String[] args){
        System.out.println("-------------Client wants to add on requirement---------------");
        Invoker invoker = new Invoker();
        Command command = new AddRequirementCommand();
        invoker.setCommand(command);
        invoker.action();
    }
}
