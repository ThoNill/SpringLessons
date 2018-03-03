package org.whySpring.componentsB;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Component;
import org.whySpring.IComponent;


@Component
//The component class implements the interface that the client use
public class BComponent implements IComponent{
    private static final AtomicInteger _counter= new AtomicInteger(0);
    private int counter;
    
    public BComponent() {
        counter = _counter.incrementAndGet();
    }

    @Override
    public String toString() {
        return "BComponent [counter=" + counter + "]";
    }

    public int getCounter() {
        return counter;
    }
    
    
}
