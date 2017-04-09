package study.neastClass;

/**
 * Created by ikocos on 25/03/2017.
 */
abstract class Mp3Player {


    protected abstract Player createPlayer();

    interface Player {
        void play(String title);

        void stop();
    }
}

public class InterfaceExample extends Mp3Player {
    public static void main(String [] args){

    }

    @Override
    protected Player createPlayer() {
        return new mPlayer();
    }
    class mPlayer implements Player{

        @Override
        public void play(String title) {

        }

        @Override
        public void stop() {

        }
    }
}
