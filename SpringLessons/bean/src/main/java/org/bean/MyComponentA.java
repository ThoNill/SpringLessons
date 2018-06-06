package org.bean;

import java.util.concurrent.atomic.AtomicInteger;

public class MyComponentA implements IComponent{
    private static final AtomicInteger _counter= new AtomicInteger(0);
    private int counter;
    
    public MyComponentA() {
        counter = _counter.incrementAndGet();
    }

    @Override
    public String toString() {
        return "MyComponentA [counter=" + counter + "]";
    }

    public int getCounter() {
        return counter;
    }
    
    
}
