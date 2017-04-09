package study.geometry.polygon;

/**
 * Created by ikocos on 11/02/2017.
 */
public class Square {
    public int sideLength;
    public Square( int sideLength){
        this.sideLength=sideLength;

    }
    public double getArea(){
        return this.sideLength*this.sideLength;
    }
}
