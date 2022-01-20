import processing.core.PApplet;

public class BallFour implements CreateBall  {
    private PApplet sketch;
    private int diameter;
    private int height;
    //private int ballSpeed=0;


    public BallFour(PApplet sketch) {
        this.sketch = sketch;
        diameter=CreateBall.diameter;
        height=(4*CreateBall.height)/5;
    }

    @Override
    public void drawBall(int ballSpeed) {
        sketch.ellipse(ballSpeed,height,diameter,diameter);
    }
}
