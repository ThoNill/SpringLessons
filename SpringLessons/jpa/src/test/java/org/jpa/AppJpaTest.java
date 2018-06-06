package org.jpa;

import static org.junit.Assert.assertNotNull;

import org.jpa.entities.dbA.A;
import org.jpa.entities.dbB.B;
import org.jpa.repo.dbA.KundenRepository;
import org.jpa.repo.dbB.RechnungRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
// Class that run the tests
@SpringBootTest(classes = { org.jpa.config.TestDbAConfig.class,
        org.jpa.config.TestDbBConfig.class })

public class AppJpaTest {

    @Autowired
    private KundenRepository kundenRepository;

    @Autowired
    private RechnungRepository rechnungRepository;

    @Test
    public void allTest() {
            doA();
            doB();
    }
    
    @Transactional("dbATransactionManager") // Name des benutzten TransactionManagers
    public void doA() {
        A user = new A();
        user = kundenRepository.save(user);
        assertNotNull(kundenRepository.findOne(user.getId()));    
    }
    
    @Transactional("dbBTransactionManager") // Name des benutzten TransactionManagers
    public void doB() {
        B user = new B();
        user = rechnungRepository.save(user);
        assertNotNull(rechnungRepository.findOne(user.getId()));    
    }

}
