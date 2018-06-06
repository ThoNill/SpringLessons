package org.database;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
// Class that run the tests
@SpringBootTest(classes = org.database.TestMultiDatabaseConfig.class)
// Run tests with the TestDatabaseConfig configuration
public class AppMultiTest {
    
    @Autowired
    @Qualifier("templateA")
    JdbcTemplate jdbcTemplateA;

    @Autowired
    @Qualifier("templateB")
    JdbcTemplate jdbcTemplateB;

    
    @Test
    public void allTest() {

        try {
            dbTest(jdbcTemplateA);
            dbTest(jdbcTemplateB);
        } catch (Exception ex) {
            fail(ex.getMessage());
        }

    }


    private void dbTest(JdbcTemplate jdbcTemplate) {
        jdbcTemplate.execute("DROP TABLE customers IF EXISTS");

        jdbcTemplate
                .execute("CREATE TABLE customers( id SERIAL, first_name VARCHAR(255), last_name VARCHAR(255))");
        jdbcTemplate
                .execute("insert into customers( first_name, last_name) values('Tomas','Nill') ");
        int anz = jdbcTemplate.queryForObject(
                "select count(*) from  customers ",
                Integer.class);
        assertEquals(anz, 1);
    }

}
