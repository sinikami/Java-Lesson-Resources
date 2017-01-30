package study;

/**
 * Created by ikocos on 21/01/2017.
 */
public class ThreeArrays {


    static int arr1[]=new int[100];
    static int arr2[]=new int[10];
    static int arr3[]=new int[10];

    static {
        for(int i=0;i<100; i++){
            arr1[i]=i;
        }
        for(int i=0;i<100; i+=10){
            arr2[i/10]=i;
        }
    }
    static {
        for(int i=0;i<10; i++){
            arr3[i]=arr1[i]+arr2[i];
        }
    }


}
