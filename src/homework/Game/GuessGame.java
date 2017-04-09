package homework.Game;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by ikocos on 25/02/2017.
 */
public class GuessGame {

    private Player player[] = new Player[3];

    GuessGame() {

        player[0] = new Player(0);
        player[1] = new Player(1);
        player[2] = new Player(2);
    }

    public void startGame() {
        int number = (int) (Math.random() * 10);
        DataController dataController = new DataController();
        dataController.setNumber(number);

        while (true) {
            try {
                for (Player player : this.player) {
                    player.guess(dataController);
                }
                printResult(dataController);

            } catch (Exception e) {
                System.out.println(e.getMessage());
                return;
            }

            if (toAsk(dataController) == false) break;

        }

    }

    private boolean toAsk(DataController dataController) {
        System.out.println("게임을 다시 진행하겠습니까? (y/n)");
        while (true) {
            Scanner scanner = dataController.getScanner();
            if (scanner.hasNext("y|n")) {
                String ch = scanner.next("y|n");
                if (ch.equalsIgnoreCase("y")) {
                    restart();
                    return true;
                } else if (ch.equalsIgnoreCase("n")) {
                    return false;
                }
                break;
            } else {
                scanner.next();
                System.out.println("y/n을 입력하세요.");

            }
        }
        return false;

    }

    public void restart() {
        int number = (int) (Math.random() * 10);
        DataController dataController = new DataController();
        dataController.setNumber(number);
    }

    public void printResult(DataController dataController) {
        System.out.println("맟춰야할 숫자는:" + dataController.getNumber() + "입니다.");

        int i = 1;
        for (int num : dataController.getGuessNums()) {
            boolean isWin = num == dataController.getNumber() ? true : false;
            System.out.println(i + "번 선수가 찍은 수 :" + num + " / " + isWin);
            i++;
        }
    }

}
