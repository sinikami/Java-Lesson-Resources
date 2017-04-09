package study.ObjectExample;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.GregorianCalendar;

/**
 * Created by ikocos on 04/03/2017.
 */
public class ObjExample {
    public static void main(String[] args) {

        File file = new File("./src");

        System.out.println(file.toString());
        GoodsStock goodsStock1 = new GoodsStock("소주", 100);
        GoodsStock goodsStock2 = new GoodsStock("소주", 100);
        //System.out.println("재고정보 = "+file);
        System.out.println(goodsStock1.toString());
        System.out.println("재고정보 = " + goodsStock1);
        GregorianCalendar gregorianCalendar1 = new GregorianCalendar(2017, 0, 1);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(2017, 0, 1);

        System.out.println(gregorianCalendar1.equals(gregorianCalendar2) ? "true" : "false");
        System.out.println(goodsStock1.equals(goodsStock2) ? "true" : "false");

        GregorianCalendar gregorianCalendar3 = (GregorianCalendar) gregorianCalendar1.clone();
        gregorianCalendar1.setTimeInMillis(file.lastModified());
        // System.out.println(gregorianCalendar1);
        // System.out.println(gregorianCalendar3);

        GoodsStock goodsStock3 = (GoodsStock) goodsStock1.clone();

        System.out.println(goodsStock3);

        Class cls = goodsStock1.getClass();

        System.out.println(cls.getName());

        Class superCls = cls.getSuperclass();
        System.out.println("superClass: " + superCls.getName());
        Field fields[] = cls.getFields();

        for (Field field : fields) {

            System.out.println("Field: " + field.getName());
        }

        Method methods[] = cls.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
        }


        Integer obj1 = new Integer(12);
        Integer obj2 = new Integer(1);

        int num = obj1.intValue() + obj2.intValue();

        System.out.println(num);
        System.out.println("==========");

        int total = 0;
        for (int i = 0; i < args.length; i++) {
           // Integer obj = new Integer(args[i]);
            total+=Integer.parseInt(args[i]);
        }
        System.out.println(total);

        System.out.println("==========");

        Integer integer = new Integer(30);
        System.out.println(integer+ 10);

        System.out.println("=====printDouble=====");
        printDouble(new Double(123.4));
        printDouble(1234.5);
    }
    static void printDouble(Double obj){
        System.out.println(obj);
    }

}
