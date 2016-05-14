package com.springinaction.springidol;

/**
 * Created by Administrator on 2016/5/14 0014.
 */
public class Sonnet29 implements Poem {
    private static String[] LINES = {"I","love","thee","I","love","thou"};
    public Sonnet29(){

    }
    public void recite(){
        for (int i = 0; i <LINES.length ; i++) {
            System.out.println(LINES[i]);
        }
    }
}

