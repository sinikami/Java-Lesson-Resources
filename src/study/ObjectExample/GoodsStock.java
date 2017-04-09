package study.ObjectExample;

import java.io.Serializable;

/**
 * Created by ikocos on 04/03/2017.
 */
public class GoodsStock implements Cloneable{//except static field/ transient field
    String goodsCode;
    int stockNum;
    transient  int discount=10;
    Object extra ;
    GoodsStock(String goodsCode,int stockNum){
        this.goodsCode=goodsCode;
        this.stockNum=stockNum;
    }
    GoodsStock(){

    }
    public String toString(){

        return "Code:"+ this.goodsCode+ " Stock:"+ this.stockNum + " Discount<transient>:" +this.discount + " Object:" + extra  ;
    }
    public void setExtra(Object obj){
        this.extra = obj;
    }
    public boolean equals(Object obj){
        if(!(obj instanceof GoodsStock))return false;
        GoodsStock goodsStock =(GoodsStock)obj;

        if(goodsCode==goodsStock.goodsCode && stockNum==goodsStock.stockNum){
            return true;
        }else {
            return false;
        }

    }
    public Object clone(){
        try{
            return super.clone();
        }catch (CloneNotSupportedException e){
            return null;
        }
    }
}
