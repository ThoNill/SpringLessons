package org.beanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MyComponentB implements IComponent, InitializingBean, DisposableBean{
    private int countPreDestroy=0;
    private int countPostConstruct=0;
    
    public MyComponentB() {
    }
    
    @Override
    public int countPostConstruct() {
     return countPostConstruct;
             
    }

    @Override
    public int countPreDestroy() {
      return countPreDestroy;
    }

    @Override
    public void destroy() throws Exception {
        countPreDestroy++;
        System.out.println("B is destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        countPostConstruct++; 
    }
    
    
}
