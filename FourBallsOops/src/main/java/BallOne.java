import processing.core.PApplet;

public class BallOne implements CreateBall  {
    private PApplet sketch;
    private int diameter;
    private int height;
    //private int ballSpeed=0;


    public BallOne(PApplet sketch) {
        this.sketch = sketch;
        diameter=CreateBall.diameter;
        height=CreateBall.height/5;
    }

    @Override
    public void drawBall(int ballSpeed) {
        sketch.ellipse(ballSpeed,height,diameter,diameter);
    }
}
