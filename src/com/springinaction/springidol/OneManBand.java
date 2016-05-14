package com.springinaction.springidol;

import java.util.Collection;

/**
 * Created by Administrator on 2016/5/14 0014.
 */
public class OneManBand implements Performer {
    public OneManBand(){}

    public void perform(){
        for (Instrument instrument: instruments) {
            instrument.play();
        }
    }

    private Collection<Instrument> instruments;

    public void setInstruments(Collection<Instrument> instruments){
        this.instruments = instruments;
    }
}
