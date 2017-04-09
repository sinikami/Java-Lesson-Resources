package study;

import study.Buffer.BufferExample;

import java.io.*;
import java.util.GregorianCalendar;


/**
 * Created by ikocos on 25/02/2017.
 */
public class FileExample {

    public static void main(String[] args) {
        //write data
        /*FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("./src/poem.txt");
            char[] data = {'1', '2', '3', '4', '5'};
            for (char ch : data) {
                fileWriter.write(ch);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fileWriter.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        //Read data
        FileReader fileReader = null;

        try {

            fileReader = new FileReader("./src/poem.txt");///Volumes/Mac/workspace/lessons/src/poem.txt
            while (true) {
                int data = fileReader.read();
                if (data < 0) break;
                char ch = (char) data;
                System.out.print(ch);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fileReader.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        //write data
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("./src/poem.txt");

            byte[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            for (byte ch : data) {
                fileOutputStream.write(ch);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fileOutputStream.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }*/

        /*if (args.length < 1) {
            System.out.println("usage: java fileDump <filename>");
            return;
        }

        FileInputStream fileInputStream = null;

        try {

            fileInputStream = new FileInputStream(args[0]);
            byte arr[] = new byte[2];
            while (fileInputStream.read(arr) >-1) {
                for (int num : arr) {
                    System.out.printf("%02x ", num);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fileInputStream.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }*/

/*

        DataOutputStream dataOutputStream = null;

        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream("./src/poem.txt"));
            int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            for (int ch : arr) {
                dataOutputStream.writeInt(ch);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                dataOutputStream.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        DataInputStream dataInputStream = null;
        try {
            dataInputStream = new DataInputStream(new FileInputStream("./src/poem.txt"));
            while (true) {
                System.out.println(dataInputStream.readInt());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (EOFException e) {
            System.out.println("끝");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                dataInputStream.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        ObjectOutputStream outputStream = null;

        try {
            outputStream = new ObjectOutputStream(new FileOutputStream("./src/poem.txt"));
            outputStream.writeObject(new GregorianCalendar(2016, 1, 14));
            outputStream.writeObject(new GregorianCalendar(2016, 3, 15));
            outputStream.writeObject(new GregorianCalendar(2016, 4, 15));
        } catch (IOException e) {

        } finally {
            try {
                outputStream.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        ObjectInputStream inputStream = null;
        try {
            inputStream = new ObjectInputStream(new FileInputStream("./src/poem.txt"));
            while (true) {
               GregorianCalendar calendar= (GregorianCalendar) inputStream.readObject();
               System.out.println(calendar.getTime());
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (EOFException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
*/

        BufferExample bufferExample =new BufferExample();
        //bufferExample.bufferOutput("./src/poem.txt");
        //bufferExample.bufferInput("./src/poem.txt");
        System.out.println();
        System.out.println("======");
        bufferExample.bufferWrite("./src/poem.txt");
        //bufferExample.bufferReader("./src/poem.txt");
        bufferExample.readLine("./src/poem.txt");

    }
}