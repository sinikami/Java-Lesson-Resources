package study;

import study.RectangleInterface.Rectangle;

/**
 * Created by ikocos on 11/02/2017.
 */
public class InterfaceExample {
    public static void main( String[] args){
        Rectangle obj = new Rectangle(100,200,10,10);
        printRectangle(obj);

        obj.moveTo(25,35);
        printRectangle(obj);
        obj.moveBy(-5,-5);
        printRectangle(obj);

        Label label =new Label("Hi",100,30,"yellow","green","굴림체");

        printRectangle(label);
        label.resize(200,60);
        label.setBackground("black");
        printRectangle(label);


    }
    static  void printRectangle(Rectangle obj){
        System.out.printf("사각혁: 위치(%d,%d) 크기 (%d X %d) %n",obj.x,obj.y,obj.width,obj.height);
    }
    static  void printRectangle(Label obj){
        System.out.printf("%s: 크기 (%d X %d) background: %s , foreground: %s, font: %s %n",obj.text,obj.width,obj.height,obj.background,obj.foreground,obj.font);
    }
}
