package abstarctclass;

public class PlayerEx {
    public static void main(String[] args) {
        // 인스턴스 사용 불가
        // Player player = new Player();
        Player player = new CDPlayer();
        player.play();
        player = new AudioPlayer();
        player.play();
    }
}
