package org.integration;

import org.springframework.context.ApplicationEvent;

public class NumberEvent  extends ApplicationEvent {
    private long number;
 
    public NumberEvent(Object source, long l) {
        super(source);
        this.number = l;
    }
    public long getNumber() {
        return number;
    }
}