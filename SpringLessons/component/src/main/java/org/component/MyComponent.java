package org.component;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Component;


@Component
//@Scope(scopeName=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MyComponent {
    private static final AtomicInteger _counter= new AtomicInteger(0);
    private int counter;
    
    public MyComponent() {
        counter = _counter.incrementAndGet();
    }

    @Override
    public String toString() {
        return "MyComponentA [counter=" + counter + "]";
    }

    protected int getCounter() {
        return counter;
    }
    
    
}
