package org.batch.controller;

import org.batch.EventGate;
import org.batch.EventGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntegrationController {
    
 //   @Autowired
  //  EventGate gate;
    
    @Autowired
    private EventGenerator generator; 
    
    @RequestMapping("/greeting")
    public String aufruf( @RequestParam(value = "number", defaultValue = "0") String l) {
      //  gate.placeOrder(20);
        generator.sendEvent(10); 
        return l;
    }
}
