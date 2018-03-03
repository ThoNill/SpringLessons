package org.whySpring.componentsA;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Component;
import org.whySpring.IComponent;


@Component
// The component class implements the interface that the client use
public class AComponent implements IComponent{
    private static final AtomicInteger _counter= new AtomicInteger(0);
    private int counter;
    
    public AComponent() {
        counter = _counter.incrementAndGet();
    }

    @Override
    public String toString() {
        return "AComponent [counter=" + counter + "]";
    }

    public int getCounter() {
        return counter;
    }
    
    
}
