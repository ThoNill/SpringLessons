package org.qualifier;

import org.springframework.stereotype.Component;


@Component
//@Scope(scopeName=ConfigurableBeanFactory.SCOPE_SINGLETON)
public interface IComponent {
   
    int getCounter() ;
    
    
}
