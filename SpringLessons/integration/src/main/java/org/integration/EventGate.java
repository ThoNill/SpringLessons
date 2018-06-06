package org.integration;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;


//@MessagingGateway(defaultRequestChannel = "inChan", defaultReplyChannel = "outChan" )    

public interface EventGate {

//@Gateway(requestChannel="ordersChannel")
void placeOrder(long order);

}
