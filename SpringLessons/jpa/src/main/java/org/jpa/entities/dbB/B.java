package org.jpa.entities.dbB;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class B {
 
    @Id
    private int id;

    public int getId() {
        return id;
    }
 
}
