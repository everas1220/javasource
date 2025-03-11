package abstarctclass;

public abstract class Player {

    boolean pause;
    int currentPos;

    Player() {
        pause = false;
        currentPos = 0;
    }

    // 추상 메서드 abstract 키워드
    abstract void play();

    void pause() {

    }
}

class CDPlayer extends Player {

    @Override
    void play() {
        System.out.println("CD플레이어");
    }
}

class AudioPlayer extends Player {

    @Override
    void play() {
        System.out.println("Audio플레이어");
    }
}
