package homework.Game;

/**
 * Created by ikocos on 25/02/2017.
 */
public class GameLauncher {

    public static  void main(String[] args){
        GuessGame guessGame =new GuessGame();
        try{
            guessGame.startGame();
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }



    }
}
