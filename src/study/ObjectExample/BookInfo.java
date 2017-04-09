package study.ObjectExample;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by ikocos on 25/03/2017.
 */
public class BookInfo extends GoodsStock implements Serializable {
    String writer;
    int page;
    static final long serialVersionUID = 9045722586745509214L;
    BookInfo(String goodsCode, int stockNum, String writer, int page) {
        super(goodsCode, stockNum);
        this.writer = writer;
        this.page = page;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeUTF(this.goodsCode);
        out.writeInt(this.stockNum);
        //out.writeUTF(this.writer);
        //out.writeInt(this.page);
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        this.goodsCode = in.readUTF();
        this.stockNum = in.readInt();
        //this.writer =in.readUTF();
        //this.page =in.readInt();
        in.defaultReadObject();
    }

    protected void getInfo() {

    }
}
