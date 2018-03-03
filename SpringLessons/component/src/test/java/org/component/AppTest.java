package org.component;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class) // Class that run the tests
@SpringBootTest(classes = TestConfig.class) // Run tests with the TestCOnfig configuration
public class AppTest 
{
    
    @Autowired
    MyComponent component1;
    
    @Autowired
    MyComponent component2;
    

    @Autowired
    MyPrototypeComponent pcomponent1;
    
    @Autowired
    MyPrototypeComponent pcomponent2;
    
    
    @Test
    public void allTest() {
        assertEquals(component1.getCounter(),component2.getCounter());
        assertNotEquals(pcomponent1.getCounter(),pcomponent2.getCounter());
    }
    
}
