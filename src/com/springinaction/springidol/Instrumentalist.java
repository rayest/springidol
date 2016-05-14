package com.springinaction.springidol;


/**
 * Created by Administrator on 2016/5/14 0014.
 */
public class Instrumentalist implements Performer {


    private String age;

    public void perform(){
        System.out.println("Playing " + song + " : ");
        instrument.play();
    }
    private String song;
    public void setSong(String song){
        this.song = song;
    }
    public String getSong(){
        return song;
    }
    private Instrument instrument;
    public void setInstrument(Instrument instrument){
        this.instrument = instrument;
    }
    public Instrument getInstrument(){
        return instrument;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }
}
