package Oops.interfaces;

import Oops.Classes.Parent;

public class Nicecar {
    Car car = new Car();
    CDPlayer player = new CDPlayer();

    void startcar(){
        car.start();
    }

    void stopcar(){
        car.stop();
    }

    void acccar(){
        car.acc();
    }

    void startmedia(){
        player.start();
    }

    void stopmedia(){
        player.stop();
    }
}
