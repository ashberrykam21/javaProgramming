package day40_FinalKeyword;

import day39_Recap.shapeTask.Circle;

public class EncapsulationReview {

    private Circle circle;

    public Circle getCircle(){
        return circle;
    }
    public void setCircle(Circle circle){
        if(circle.getRadius()<5){

        }
        this.circle = circle;
    }

}
