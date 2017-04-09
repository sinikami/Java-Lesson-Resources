package study.ObjectExample;

import study.tools.print;

import java.io.*;

/**
 * Created by ikocos on 25/03/2017.
 */
public class runDistrChart {

    public static void main(String[] args) {
        if (write()) {
            read();
        }

    }

    public static boolean write() {
        ObjectOutputStream outputStream = null;

        try {
            DistrChart distrChart = new DistrChart();
            distrChart.arr[0][2] = 10;
            distrChart.arr[1][2] = 10;
            distrChart.arr[2][1] = 10;
            distrChart.arr[4][1] = 10;
            distrChart.arr[5][1] = 10;
            distrChart.arr[6][5] = 10;
            distrChart.arr[7][7] = 10;
            distrChart.arr[8][3] = 10;
            distrChart.arr[9][9] = 10;

            outputStream = new ObjectOutputStream(new FileOutputStream("./src/DistrChart.txt"));
            outputStream.writeObject(distrChart);

        } catch (FileNotFoundException e) {
            print.r(e.getMessage());

        } catch (IOException e) {
            print.r(e.getMessage());
        } finally {
            try {
                outputStream.close();
            } catch (Exception e) {
                print.r(e.getMessage());
            }
        }
        return true;
    }

    public static void read() {
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("./src/DistrChart.txt"));

            DistrChart distrChart = (DistrChart) objectInputStream.readObject();

            for (int[] arr : distrChart.arr) {
                for (int i : arr) {
                    print.f("%s\t", i);
                }
                System.out.println();
            }


        } catch (FileNotFoundException e) {
            print.r(e.getMessage());
        } catch (EOFException e) {
            print.r("End");
        } catch (IOException e) {
            print.r("IO: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            print.r(e.getMessage());
        } finally {
            try {
                objectInputStream.close();
            } catch (Exception e) {
                print.r(e.getMessage());
            }
        }

    }

}
