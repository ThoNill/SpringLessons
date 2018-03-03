package org.qualifier;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("componentB")
public class MyComponentB implements IComponent {
    private static final AtomicInteger _counter= new AtomicInteger(0);
    private int counter;
    
    public MyComponentB() {
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
