package com.springinaction.springidol;

import java.util.Map;

/**
 * Created by Administrator on 2016/5/14 0014.
 */
public class OneManBandToo implements Performer {
    public OneManBandToo(){}

    public void perform(){
        for (String key: instruments.keySet()){
            System.out.println(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }

    public Map<String, Instrument> instruments;

    public void setInstruments(Map<String,Instrument> instruments){
        this.instruments = instruments;
    }
}
