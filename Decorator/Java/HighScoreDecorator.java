public class HighScoreDecorator extends Decorator{
    public HighScoreDecorator(SchoolReport sr){
        super(sr);
    }

    private void reportHighScore(){
        System.out.println("The highest scores of math is 78, nature is 80.");
    }

    @Override
    public void report(){
        this.reportHighScore();
        super.report();
    }
}
