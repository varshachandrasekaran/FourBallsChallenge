import processing.core.PApplet;

public class FourBalls extends PApplet {
    int firstBallSpeed=0,secondBallSpeed=0,thirdBallSpeed=0,fourthBallSpeed=0;

    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(1000,800);
    }

    @Override
    public void setup() {
        super.setup();
        background(32);
    }

    @Override
    public void draw() {
        BallOne ballOne=new BallOne(this);
        ballOne.drawBall(firstBallSpeed);
        firstBallSpeed++;

        BallTwo ballTwo=new BallTwo(this);
        ballTwo.drawBall(secondBallSpeed);
        secondBallSpeed+=2;

        BallThree ballThree=new BallThree(this);
        ballThree.drawBall(thirdBallSpeed);
        thirdBallSpeed+=3;

        BallFour ballFour=new BallFour(this);
        ballFour.drawBall(fourthBallSpeed);
        fourthBallSpeed+=4;
    }
}
