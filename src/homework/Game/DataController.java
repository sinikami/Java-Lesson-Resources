package homework.Game;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ikocos on 25/02/2017.
 */
public class DataController {
    private int[] guessNumbers = new int[3];
    private int setNumber;
    private Scanner scanner;

    DataController() {
        this.scanner = new Scanner(System.in);
    }

    public void setGuessNum(int key) throws Exception {
            if (this.scanner.hasNextInt()) {
                guessNumbers[key] = this.scanner.nextInt();
            }else{
                throw new Exception("0 ~ 9 사이의 숫자만 입력 가능합니다.");
            }
    }

    public int[] getGuessNums() {
        return guessNumbers;
    }

    public void setNumber(int num) {
        setNumber = num;
    }

    public int getNumber() {
        return this.setNumber;
    }

    public Scanner getScanner() {
        return this.scanner;
    }
}
