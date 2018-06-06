package org.beanLifeCycle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
// Class that run the tests
@SpringBootTest(classes = TestConfig.class)
// Run tests with the TestCOnfig configuration
public class AppTest {
    
    @Autowired
    @Qualifier("componentA")
    public IComponent pcomponentA;

    @Autowired
    @Qualifier("componentB")
    public IComponent pcomponentB;

    @Test
    public void allTest() {
        assertEquals(1,pcomponentA.countPostConstruct());
        assertEquals(1,pcomponentB.countPostConstruct());
        assertEquals(0,pcomponentA.countPreDestroy());
        assertEquals(0,pcomponentB.countPreDestroy());
    }

}
