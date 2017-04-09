package study.ObjectExample;

import study.tools.print;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by ikocos on 25/03/2017.
 */
public class ObjectInputExample {
    public static void main(String[] args) {

        ObjectInputStream objectInputStream = null;
        ObjectOutputStream objectOutputStream;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("./src/object.txt"));
            objectOutputStream.writeObject(new GregorianCalendar(2016, 02, 24));
            FileInputStream fileInputStream = new FileInputStream("./src/object.txt");

            objectInputStream = new ObjectInputStream(fileInputStream);

            while (true) {
                GregorianCalendar gregorianCalendar = (GregorianCalendar) objectInputStream.readObject();
                print.r(gregorianCalendar.get(Calendar.MONTH) + 1);
                print.r(gregorianCalendar.get(Calendar.DATE));
            }

        } catch (FileNotFoundException e) {
            print.r(e.getMessage());
        } catch (EOFException e) {
            System.out.println("EOF");
        } catch (IOException e) {
            print.r(e.getMessage());
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
