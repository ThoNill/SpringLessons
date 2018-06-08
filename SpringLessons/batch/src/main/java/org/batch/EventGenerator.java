package org.batch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EventGenerator  {
    
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;
 
    public void sendEvent(final long l) {
        System.out.println("Publishing custom event. ");
        NumberEvent numberEvent = new NumberEvent(this, l);
        applicationEventPublisher.publishEvent(numberEvent);
        
    }
}
