package study;

/**
 * Created by ikocos on 21/01/2017.
 */
public class Numbers {
    int num[];
    Numbers(int arr[]){
        this.num =arr;
    }
    int getTotal(){
        int sum=0;
        for (int i : this.num){
            sum+= i;
        }

        return  sum;
    }
    int getAverage(){
        int sum =getTotal();
        return sum / this.num.length;
    }
}
