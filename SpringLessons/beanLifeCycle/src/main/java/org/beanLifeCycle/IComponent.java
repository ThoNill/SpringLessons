package org.beanLifeCycle;

import org.springframework.stereotype.Component;


@Component
//@Scope(scopeName=ConfigurableBeanFactory.SCOPE_SINGLETON)
public interface IComponent {
   
    int countPostConstruct() ;
    int countPreDestroy() ;
    
}
