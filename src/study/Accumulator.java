package study;

/**
 * Created by ikocos on 21/01/2017.
 */
public class Accumulator {
    static int grandTotal =0;
    int total;


    void accumulate(int grandTotal){
        this.grandTotal+= grandTotal;
        this.total+=grandTotal;
    }
    static int getGrandTotal(){
        return grandTotal;
    }

}
