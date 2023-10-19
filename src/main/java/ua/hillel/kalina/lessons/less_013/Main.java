package ua.hillel.kalina.lessons.less_013;

public class Main {


    public static void main(String[] args) {

        MusicStyles[] musicStyles= {new PopMusic(),new ClassicMusic(),new RockMusic()};

        System.out.println();

        for (MusicStyles style : musicStyles) {
            style.playMusic();

        }

    }
}
