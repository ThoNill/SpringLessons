package org.beanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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
