package homework.Game;

/**
 * Created by ikocos on 25/02/2017.
 */
public class Player {
    private int key;

    Player(int key) {
        this.key = key;
    }

    public void guess(DataController dataController) throws Exception {
        System.out.println("0 ~ 9 사이의 숫자를 선택하세요.");
        dataController.setGuessNum(this.key);
    }


}
