package homework;

/**
 * Created by ikocos on 30/01/2017.
 */
public class homework_03_01 {
    String code;
    String title;
    String manufacturer;
    int price;
    float discountRate = 0.00f;

    homework_03_01(String code, String title, String manufacturer, int price, float discountRate) {
        this.code = code;
        this.title = title;
        this.manufacturer = manufacturer;
        this.price = price;
        this.discountRate = discountRate;
    }

    homework_03_01(String code, String title, String manufacturer, int price) {
        this.code = code;
        this.title = title;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public void setDiscountRate(float discountRate) {
        this.discountRate = discountRate;
    }

    public int getPrice() {
        this.price = (int) Math.floor(this.price * (1 - this.discountRate));
        return this.price;
    }

}
