package org.jpa.entities.dbA;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class A {
    @Id
    private int id;

    public int getId() {
        return id;
    }
}
