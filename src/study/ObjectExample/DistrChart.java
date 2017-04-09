package study.ObjectExample;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by ikocos on 25/03/2017.
 */
public class DistrChart implements Serializable {
    int arr[][];

    DistrChart() {
        arr = new int[10][10];
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] != 0) {
                    out.writeInt(row);
                    out.writeInt(col);
                    out.writeInt(arr[row][col]);
                }
            }

        }

    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        //print.r(arr.length +"");
        arr = new int[10][10];
        try {
            while (true) {
                int row = in.readInt();
                int col = in.readInt();
                int data = in.readInt();
                // print.r( arr[row][col]);
                arr[row][col] = data;
            }
        }catch (Exception e){

        }

    }


}
