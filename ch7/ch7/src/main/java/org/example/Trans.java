package org.example;

public abstract class Trans {

    protected String result = "";

    // 추상 메소듵
    public abstract void start(String arrival);
    public abstract void stop(String departure);
    public abstract void name(String name);
}
