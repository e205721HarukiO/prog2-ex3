package jp.ac.uryukyu.ie.mobpro;
import java.util.Random;

public class Dice {
    private int value;

    public Dice(){
        this.value = play();
    }

    public int play(){
        Random rand = new Random();
        int val = rand.nextInt(5);
        val += 1;
        return val;
    }

    public int getValue(){
        return value;
    }

}
