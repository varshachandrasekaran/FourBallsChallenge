import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int WIDTH = 1000;
    public static final int HEIGHT = 800;
    public static final int diameter = 20;
    public static final int firstBallHeight = 160;
    public static final int secondBallHeight = 320;
    public static final int thirdBallHeight = 480;
    public static final int fourthBallHeight = 640;
    int firstBallSpeed=0,secondBallSpeed=0,thirdBallSpeed=0,fourthBallSpeed=0;


    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        background(32);
    }

    @Override
    public void draw() {
        // Ball 1
        coloringBall(204,229,255);
        drawBall(firstBallSpeed,firstBallHeight,diameter);
        firstBallSpeed=firstBallSpeed+1;

        //Ball 2
        coloringBall(255,204,229);
        drawBall(secondBallSpeed,secondBallHeight,diameter);
        secondBallSpeed=secondBallSpeed+2;

        //Ball 3
        coloringBall(255,255,153);
        drawBall(thirdBallSpeed,thirdBallHeight,diameter);
        thirdBallSpeed=thirdBallSpeed+3;

        //Ball 4
        coloringBall(153,255,153);
        drawBall(fourthBallSpeed,fourthBallHeight,diameter);
        fourthBallSpeed=fourthBallSpeed+4;
    }

    private void coloringBall(int red,int green,int blue) {
        fill(red,green,blue);
    }

    private void drawBall(int initialSpeed,int height, int diameter) {
        ellipse(initialSpeed, height, diameter, diameter);
    }


}
