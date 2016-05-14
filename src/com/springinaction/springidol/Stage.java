package com.springinaction.springidol;

/**
 * Created by Administrator on 2016/5/14 0014.
 */
public class Stage {
    private Stage(){}
    private static class StageSingletonHolder{
        static Stage instance = new Stage();
    }

    public static Stage getInstance(){
        return StageSingletonHolder.instance;
    }
}

