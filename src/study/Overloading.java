package study;

/**
 * Created by ikocos on 21/01/2017.
 */
public class Overloading {//메소드 오버로딩
    String name;
    int age;
    float height, weight;

    Overloading(String name,int age, float height, float weight){
        this.name=name;
        this.age =age;
        this.height=height;
        this.weight=weight;
    }
    void update(int age ){
        this.age =age;
    }
    void update(int age, float height ){
        update(age);
        this.height =height;

    }
    void update(int age, float height, float weight){

        update(age,height);
        this.weight=weight;
    }


}
