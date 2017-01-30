package study;

/**
 * Created by ikocos on 21/01/2017.
 */
public class StaticField {
    final  static int UPPER_LIMIT =1000;
    int value ;
    void setValue(int val){
        if(val <UPPER_LIMIT){
            this.value=val;
        }else {
            this.value =UPPER_LIMIT;
        }
    }

}
