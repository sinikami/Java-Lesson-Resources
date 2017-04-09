package study;

import study.Account.Account;

/**
 * Created by ikocos on 14/01/2017.
 */
public class ObjectExamples {
    public static void main(String[] args) {

    /*    StringBuffer buffer;
        buffer = new StringBuffer("hey,java");
        buffer.deleteCharAt(1);
        buffer.deleteCharAt(1);
        buffer.insert(1, "i");
        System.out.println(buffer);*/

        GoodsStock goodsStock;
        goodsStock = new GoodsStock("ssss",200);
      /*  goodsStock.goodsCode = "52135";
        goodsStock.stockNum = 50;*/

        System.out.println("상품코드:" + goodsStock.goodsCode);
        System.out.println("재고:" + goodsStock.stockNum);
        goodsStock.addStock(50);

        System.out.println("상품코드:" + goodsStock.goodsCode);
        System.out.println("재고:" + goodsStock.stockNum);


        SubscriberInfo subscriberInfo;
        //subscriberInfo = new SubscriberInfo("A1","plusmx","pp");
        subscriberInfo = new SubscriberInfo("A1","plusmx","pp","eee","asdfasdf");
        //subscriberInfo = new SubscriberInfo();// 기본 생성자
        System.out.println(subscriberInfo.toString());

       /* Circle circle =new Circle(0.0);
        circle.radius=5.0;
        double area =circle.getArea();
        System.out.println(circle.radius);
        System.out.println(area);*/

       Account account1 =new Account("111-222-333","pp",10000);
       Account account2 =new Account("444-555-999","sb",50000);

       account1.deposit(5000);
       try{
           account2.withdraw(1000000);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }

        printAccount(account1);
        printAccount(account2);
        int arr[]=new int[0];//{10,20,30,40,50,60,70,80,90,100};
        Numbers numbers =new Numbers(arr);

        int total = numbers.getTotal();


        System.out.println(total);
        try{
            int average = numbers.getAverage();
            System.out.println(average);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        Overloading overloading =new Overloading("시니카미",20,50.0f,60.0f);
        printOverLoad(overloading);
        overloading.update(11);
        printOverLoad(overloading);
        overloading.update(12,157.0f);
        printOverLoad(overloading);
        overloading.update(13,145.0f,45.0f);
        printOverLoad(overloading);

        System.out.println(Accumulator.grandTotal);
        Accumulator accumulator1 =new Accumulator( );
        Accumulator accumulator2 =new Accumulator();
        accumulator1.accumulate(10);

        accumulator2.accumulate(20);
        int grandTotal =Accumulator.getGrandTotal();


        System.out.println("===========Accumulator===========");
        System.out.println("total1:"+ accumulator1.total );
        System.out.println("total2:"+ accumulator2.total );
        System.out.println("grandTotal:"+ grandTotal );

        StaticField staticField = new StaticField();

        staticField.setValue(20000);


        System.out.println("===========StaticField===========");
        System.out.println("value:"+ staticField.value);
        System.out.println("UPPER_LIMIT:"+ staticField.UPPER_LIMIT);

       for(int i : ThreeArrays.arr3){
           System.out.println(i);
       }


    }
    static void printOverLoad(Overloading account){
        System.out.println("===========OverLoading===========");
        System.out.println(">>>age:" + account.age);
        System.out.println("height:" + account.height);
        System.out.println("weight:" + account.weight);
    }
    static void printAccount(Account account){
        System.out.println(">>>account:" + account.accountNo);
        System.out.println("ownerName:" + account.ownerNanme);
        System.out.println("balance:" + account.balance);
    }
}
