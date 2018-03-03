package org.component;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(scopeName=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MyPrototypeComponent {
    private static final AtomicInteger _counter= new AtomicInteger(0);
    private int counter;
    
    public MyPrototypeComponent() {
        counter = _counter.incrementAndGet();
    }

    @Override
    public String toString() {
        return "MyPrototypeComponent [counter=" + counter + "]";
    }

    protected int getCounter() {
        return counter;
    }
    
    
}
