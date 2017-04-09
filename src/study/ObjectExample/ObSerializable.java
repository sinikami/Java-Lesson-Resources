package study.ObjectExample;

import study.tools.print;

import java.io.*;

/**
 * Created by ikocos on 25/03/2017.
 */
public class ObSerializable {
    public static void main(String[] args) {
       // if (write()) {
            read();
      //  }
    }

    public static void read() {
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("./src/goods.txt"));
            while (true) {
              //  GoodsStock goodsStock = (GoodsStock) objectInputStream.readObject();
                BookInfo bookInfo = (BookInfo) objectInputStream.readObject();
                System.out.println("writer:" + bookInfo.writer);
                System.out.println("page:" + bookInfo.page);
                System.out.println("Code:" + bookInfo.goodsCode);
                System.out.println("Stock:" +bookInfo.stockNum);
            }


        } catch (FileNotFoundException e) {
            print.r(e.getMessage());
        } catch (EOFException e) {
            print.r("eof");
        } catch (IOException e) {
            print.r("IO: "+e.getMessage());
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

    public static boolean write() {
        ObjectOutputStream outputStream = null;

        try {
            BookInfo bookInfo = new BookInfo("Iphone", 100,"L.J.",200);

            outputStream = new ObjectOutputStream(new FileOutputStream("./src/goods.txt"));
            outputStream.writeObject(bookInfo);

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
}
