package study.CDInfo;

/**
 * Created by ikocos on 04/02/2017.
 */
public interface Lendable {
    final static byte STATE_BORROWED = 1;
    final static byte STATE_NOMAL = 0;

    void checkOut(String borrower, String date) throws Exception;

    void checkIn();
}
