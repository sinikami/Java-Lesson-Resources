package study;

/**
 * Created by ikocos on 14/01/2017.
 */
public class GoodsStock {

    public String goodsCode =null;
    public int stockNum =0 ;

    public GoodsStock(String goodsCode,int stockNum){//생성자 => 캡슐화
        this.goodsCode=goodsCode;
        this.stockNum=stockNum;
    }
    public void addStock(int quantity){//기능 메소드
        stockNum+= quantity;
    }

   /* public String getGoodsCode() {
        return goodsCode;
    }

    public int getStockNum() {
        return stockNum;
    }*/
}
