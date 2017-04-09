package study.CDInfo;

/**
 * Created by ikocos on 04/02/2017.
 */
public class SeparateVolume implements Lendable {
    String borrower;
    String checkOutDate;
    String registerNo;
    String bookTitle;
    String writer;
    public byte state;

    public SeparateVolume(String registerNo, String title, String writer) {

        this.registerNo = registerNo;
        this.bookTitle = title;
        this.writer = writer;
    }

    @Override
    public void checkOut(String borrower, String date) throws Exception {
        if (this.state != Lendable.STATE_NOMAL) {
            throw new Exception("해당 도서는 대출중입니다.");
        }
        this.borrower = borrower;
        this.checkOutDate = date;
        this.state = 1;
        System.out.println("=============");
        System.out.println("*" + bookTitle + "대출");
        System.out.println("대출인:" + borrower  );
        System.out.println("대출일:" + date  );
    }

    @Override
    public void checkIn() {
        this.borrower = null;
        this.checkOutDate = null;
        this.state = Lendable.STATE_BORROWED;
        System.out.println("*" + bookTitle + "반납");
    }

}
