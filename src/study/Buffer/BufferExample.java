package study.Buffer;

import java.io.*;

/**
 * Created by ikocos on 25/02/2017.
 */
public class BufferExample {

    public void bufferOutput(String file) {
        //write data
        BufferedOutputStream fileOutputStream = null;
        try {
            fileOutputStream =new BufferedOutputStream(new FileOutputStream(file));

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
        }



    }
    public void bufferInput(String file){
        BufferedInputStream fileInputStream = null;

        try {

            fileInputStream = new BufferedInputStream(new FileInputStream(file));
            byte arr[] = new byte[2];
            while (fileInputStream.read(arr) > -1) {
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
        }
    }

    public  void bufferWrite(String file){
        //write data
        BufferedWriter  fileWriter = null;
        try {
            fileWriter = new BufferedWriter(new FileWriter(file));
            char[] data = {'1', '2', '3', '4', '5','6','7'};
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


    }
    public void bufferReader(String file){
        //Read data
        BufferedReader fileReader = null;

        try {

            fileReader = new BufferedReader( new FileReader(file));///Volumes/Mac/workspace/lessons/src/poem.txt
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
    }
    public void readLine(String file){
        LineNumberReader lineNumberReader =null;
        try{
            lineNumberReader = new LineNumberReader(new FileReader(file));
            while(true){
                String str  = lineNumberReader.readLine();
                if(str == null) break;
                int lineNo = lineNumberReader.getLineNumber();
                System.out.println(lineNo +": "+ str);
            }
        }catch (FileNotFoundException e){

        }catch (IOException e){

        }finally {
            try{
                lineNumberReader.close();;
            }catch (Exception e){

            }
        }
    }
}
