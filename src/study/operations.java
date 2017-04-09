package study;

public class operations {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
      /*  fourRules();
        fourRules2();
        sign();
        concat();
        Assignment();
        Assignment2();
        Assignment3();
        IncDec();*/
      //  comp();
       // Equality();
        //Equality2();
        //Logical();
        //Conditional();
     //   Conditional2();
        //bits();
        //shift();
        //shift2();
       // shift3();
        //compAssignment();
        cast();
    }

    //fourRules
    public static void fourRules() {
        int num1 = 1 / 2 - 3;
        double num2 = 2.0 + 1.5 * 2.0;
        int num3 = 10 / 3 / 2;
        int num4 = 2 * 5 / 2;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }

    static void fourRules2() {
        byte a = 2, b = 3;// sum byte 인경우 에러
        int sum;
        sum = a + b;
        System.out.println(sum);
    }

    public static void sign() {
        short num1 = 100;
//		short num2 = -num1; // 에러 -num1 int 타입으로 자동변환 
        int num2 = -num1;
        System.out.println(num2);
    }

    public static void concat() {
        String str1 = "num" + 3 + 4;
        String str2 = 3 + 4 + "num";
        System.out.println(str1);
        System.out.println(str2);

    }

    public static void Assignment() {
        byte num1 = 9;
        short num2 = num1;
        int num3 = num2;
        long num4 = num3;
        float num5 = num4;
        double num6 = num5;
        System.out.println(num6);
    }

    public static void Assignment2() {
        char ch = '냥';
        System.out.println(ch);
        int num = ch;
        System.out.println(num);
    }
    public static void Assignment3(){
        int num1 , num2;
        num2 = (num1=10) ;// = num2=num1=10;
        // num1 이 선언되어 있을 경우  int num2=num1=10 가능
        System.out.println(num1);
        System.out.println(num2);
    }
    public static  void  IncDec(){
        int num1=0, num2=0,num3=0,num4=0;
        int result1 = num1++;
        int result2 = num2--;
        int result3 = ++num3;
        int result4 = --num4;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
    public static void comp(){
        System.out.println(3<4);
        System.out.println(10>20.0);
        System.out.println(12.5f<=11);
        System.out.println(7>=7);
    }
    public static void Equality(){
        int num1=5;
        int num2 = 3+2;
        if(num1 ==num2){
            System.out.println("This is true.");
        }
        if((num1!=num2)==false){
            System.out.println("This is false");
        }
    }
    public static void Equality2(){
        double num1 =1.1+2.2;
        double num2= 3.3;

        if(num1 == num2){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }

    public static void Logical(){
        int a=3, b=4,c=3,d=5;
        if((a==2 | a==c) & !(c>d) & (1==b^c!=d) ){
            System.out.println("This is true");
        }else{

            System.out.println("This is false");
        }
    }
    public static void Conditional(){
        int num1=0, num2=0;
        if(++num1>0 || ++num2>0){
            System.out.println("num1 is grater thn num2");
        }

        System.out.println("Num1:" +num1);
        System.out.println("Num2:" +num2);
    }

    public static void Conditional2(){
        int a=20,b=30,max;
        max =a>b?a:b;
        System.out.println(max);
    }
    public static  void bits(){
        int num1=0xFFFF0000;
        int num2=0xFF00FF00;
        int result1= num1 & num2;
        int result2 = num1|num2;
        int result3 = num1 ^ num2;
        int result4 = ~num1;
        System.out.printf("%08x %n",result1);
        System.out.printf("%08x %n",result2);
        System.out.printf("%08x %n",result3);
        System.out.printf("%08x %n",result4);

    }
    public static void shift(){

        int num = 0xFF00FF01;

        int result1 = num <<3;
        int result2 = num >>3;
        int result3 = num >>>3;
        System.out.printf("%08x %n",result1);
        System.out.printf("%08x %n",result2);
        System.out.printf("%08x %n",result3);
    }
    public static  void shift2(){
        int num =12;
        int num1 = num<<2;
        int num2 = num >>2;
        int num3 = num >>>2;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }

    public static void shift3(){
        int num1= 0xFFFFFFFE;//1111 1111 1111 1111 1111 1111 1111 1110
        int num2 = num1<<30;
        int num3 = num1<<31;
        int num4 = num1<<32;
        int num5 = num1<<33;
        int num6 = num1<<34;
        System.out.printf("%08x %n",num2);
        System.out.printf("%08x %n",num3);
        System.out.printf("%08x %n",num4);
        System.out.printf("%08x %n",num5);
        System.out.printf("%08x %n",num6);
    }
    public static void compAssignment(){

        int num =29;
        num -= 2+3*4;
        System.out.println(num);
    }
    public static void cast (){
        short num1 = (short) 300;
        byte num2 = (byte) 300;
        int num3 = (int) 12.9;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
