public class DeletePageCommand extends Command{
    public void execute(){
        super.pg.find();
        super.pg.delete();
        super.pg.plan();
    }
}
