package Oops.interfaces;

public class CDPlayer implements Media {

    @Override
    public void start() {
        System.out.println("I start the media player");
    }

    @Override
    public void stop() {
        System.out.println("I Stop the media player");
    }
}
