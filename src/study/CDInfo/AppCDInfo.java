package study.CDInfo;

/**
 * Created by ikocos on 04/02/2017.
 */
public class AppCDInfo extends CDInfo implements Lendable {
    String borrower;
    String checkOutDate;
    byte state;
    public AppCDInfo(String registerNo, String title){
        super(registerNo,title);

    }

    @Override
    public void checkOut(String borrower,String date) throws Exception{
        if(this.state!=Lendable.STATE_NOMAL){
            return;
        }
        this.borrower=borrower;
        this.checkOutDate=date;
        this.state=1;
        System.out.println("==============");
        System.out.println("*" + title +"대출");
        System.out.println("대출인:" + borrower  );
        System.out.println("대출일:" + date  );
    }

    @Override
    public void checkIn() {
        this.borrower=null;
        this.checkOutDate=null;
        this.state=Lendable.STATE_BORROWED;
        System.out.println("*"+title +"반납");
    }

}
