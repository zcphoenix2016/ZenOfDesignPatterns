public class SortDecorator extends Decorator{
    public SortDecorator(SchoolReport sr){
        super(sr);
    }

    private void reportSort(){
        System.out.println("My sort is 38th...");
    }

    @Override
    public void report(){
        super.report();
        this.reportSort();
    }
}
