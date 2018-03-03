package org.beanLifeCycle;

import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class MyComponentA implements IComponent{
    private int countPreDestroy=0;
    private int countPostConstruct=0;
    
    public MyComponentA() {
    }

    @PostConstruct
    public void pc() {
        countPostConstruct++;
    }
    
    @PreDestroy
    public void pd() {
        countPreDestroy++;
        System.out.println("A is destroyed");   
    }
    
    @Override
    public int countPostConstruct() {
     return countPostConstruct;
             
    }

    @Override
    public int countPreDestroy() {
      return countPreDestroy;
    }
    
    
}
