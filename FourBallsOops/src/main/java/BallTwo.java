import processing.core.PApplet;

public class BallTwo implements CreateBall  {
    private PApplet sketch;
    private int diameter;
    private int height;
    //private int ballSpeed=0;


    public BallTwo(PApplet sketch) {
        this.sketch = sketch;
        diameter=CreateBall.diameter;
        height=(2*CreateBall.height)/5;
    }

    @Override
    public void drawBall(int ballSpeed) {
        sketch.ellipse(ballSpeed,height,diameter,diameter);
    }
}
