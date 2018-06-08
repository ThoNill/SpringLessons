package org.batch;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class NumberEventListener implements ApplicationListener<NumberEvent> {
    @Override
    public void onApplicationEvent(NumberEvent event) {
        System.out.println("Received spring custom event - " + event.getNumber());
    }
}
